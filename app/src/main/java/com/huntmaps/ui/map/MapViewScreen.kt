package com.huntmaps.ui.map

import android.graphics.BitmapFactory
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.Label
import androidx.compose.material.icons.outlined.CenterFocusWeak
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Tune
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.util.lerp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.huntmaps.data.LootPoint
import com.huntmaps.data.LootType
import com.huntmaps.data.MapData
import com.huntmaps.ui.components.CircleIconButton
import com.huntmaps.ui.theme.AccentGold
import com.huntmaps.ui.theme.AccentRed
import com.huntmaps.ui.theme.BgBase
import com.huntmaps.ui.theme.BgSurface
import com.huntmaps.ui.theme.Ink
import com.huntmaps.ui.theme.Outline
import com.huntmaps.ui.theme.ScrimDark
import com.huntmaps.ui.theme.TextPrimary
import com.huntmaps.ui.theme.TextSecondary
import com.huntmaps.ui.theme.TopBarFade
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.math.sqrt

private const val MIN_ZOOM = 1f
private const val MAX_ZOOM = 10f

// Стиль подписей локаций: светлый текст с мягкой тёмной тенью
private val LocationTextColor = Color(0xFFB7B7B7)
private val LocationTextShadow = Color(0xB310100E) // тень: тот же тёмный, приглушённый

/*
 * ЭКРАН 2. Карта: изображение с зумом и перемещением, поверх — маркеры лута.
 *
 * Как это устроено (простыми словами):
 *  - картинку можно приближать щипком (1x…10x) и двигать пальцем;
 *  - координаты точек хранятся в долях (0…1), поэтому положение маркера
 *    пересчитывается под любой размер экрана и любой зум;
 *  - сами маркеры при зуме НЕ растут — как значки в навигационных
 *    приложениях: растёт расстояние между ними, а размер остаётся удобным;
 *  - «веер»: если подушечки маркеров наезжают друг на друга (в одном
 *    здании стоит несколько объектов), они расходятся в стороны, а к
 *    настоящему месту каждого ведёт тонкая золотая нить. Тап ловит
 *    маркер уже по его разъехавшейся позиции.
 */
@Composable
fun MapViewScreen(
    mapId: String?,
    onBack: () -> Unit,
    onOpenLegend: () -> Unit
) {
    val map = MapData.byId(mapId)

    // Состояние экрана (rememberSaveable — не сбрасывается при повороте экрана)
    var scale by rememberSaveable { mutableFloatStateOf(1f) }
    var panX by rememberSaveable { mutableFloatStateOf(0f) }
    var panY by rememberSaveable { mutableFloatStateOf(0f) }
    var activeTypes by rememberSaveable { mutableStateOf(LootType.entries.toSet()) }
    var selectedPointIndex by rememberSaveable { mutableIntStateOf(-1) }
    var filtersOpen by rememberSaveable { mutableStateOf(false) }
    var hintVisible by rememberSaveable { mutableStateOf(true) }
    var fullPhoto by rememberSaveable { mutableStateOf(false) }
    // Названия локаций: включены по умолчанию, кнопкой-тегом скрываются
    var showLocations by rememberSaveable { mutableStateOf(true) }

    // выбранная точка — для карточки с фото
    val selectedPoint = selectedPointIndex.takeIf { it >= 0 }?.let { map.points.getOrNull(it) }

    // Размер области карты на экране, в пикселях
    var viewport by remember { mutableStateOf(IntSize.Zero) }

    // Буферы «веера»: экранные позиции точек и их смещения при наложении.
    // Общие для отрисовки и тапа — чтобы палец попадал ровно в нарисованный
    val basePos = remember(map) { FloatArray(map.points.size * 2) }
    val fanOff = remember(map) { FloatArray(map.points.size * 2) }
    val visible = remember(map, activeTypes) {
        BooleanArray(map.points.size) { map.points[it].type in activeTypes }
    }

    val painter = painterResource(map.imageRes)
    // Соотношение сторон картинки возьмётся из самого файла — ничего настраивать не нужно
    val intrinsic = painter.intrinsicSize
    val aspect = if (intrinsic.width > 0f && intrinsic.height > 0f) {
        intrinsic.width / intrinsic.height
    } else {
        1f
    }

    // Надписи названий меряются здесь один раз — в кадре остаётся только отрисовка
    val textMeasurer = rememberTextMeasurer()
    val locationLabels = remember(map.locations, textMeasurer) {
        val style = TextStyle(
            fontFamily = FontFamily.Serif, // системный serif — ближайшая замена Georgia
            fontSize = 15.sp,              // крупнее: у мелких букв беж «съедает» окантовка
            fontWeight = FontWeight.Bold
        )
        map.locations.map { loc -> loc to textMeasurer.measure(loc.name, style) }
    }

    LaunchedEffect(Unit) {
        delay(4500)
        hintVisible = false
    }
    LaunchedEffect(selectedPointIndex) {
        fullPhoto = false
    }
    // Если выбранный тип спрятали фильтром — снимаем выбор,
    // чтобы карточка с фото не висела без маркера на карте
    LaunchedEffect(activeTypes) {
        val sel = selectedPointIndex
        if (sel >= 0 && map.points.getOrNull(sel)?.type !in activeTypes) {
            selectedPointIndex = -1
        }
    }

    // Кнопка «назад» сначала закрывает фильтр, если он открыт
    BackHandler(enabled = filtersOpen) { filtersOpen = false }
    BackHandler(enabled = fullPhoto) { fullPhoto = false }

    // Вписанный размер картинки при масштабе 1 (картинка показывается целиком)
    fun baseSize(vw: Float, vh: Float): Pair<Float, Float> {
        val bw = min(vw, vh * aspect)
        return Pair(bw, bw / aspect)
    }

    // Ограничение сдвига: карта не должна «уехать» за края экрана
    fun clampPan(x: Float, y: Float, s: Float, vw: Float, vh: Float): Offset {
        val (bw, bh) = baseSize(vw, vh)
        val maxX = max(0f, (bw * s - vw) / 2f)
        val maxY = max(0f, (bh * s - vh) / 2f)
        return Offset(x.coerceIn(-maxX, maxX), y.coerceIn(-maxY, maxY))
    }

    // Экранные позиции всех точек — центры «настоящих» мест
    fun fillBase(vw: Float, vh: Float, bw: Float, bh: Float, s: Float, px: Float, py: Float) {
        for (i in map.points.indices) {
            val p = map.points[i]
            basePos[i * 2] = vw / 2f + (p.x - 0.5f) * bw * s + px
            basePos[i * 2 + 1] = vh / 2f + (p.y - 0.5f) * bh * s + py
        }
    }

    // Насколько раскрыт веер при данном зуме: 0 — маркеры на местах, 1 — полностью
    fun fanStrength(s: Float): Float {
        val zoomT = ((s - 1.3f) / 2.3f).coerceIn(0f, 1f)
        return ((zoomT - 0.35f) / 0.25f).coerceIn(0f, 1f)
    }

    // Желаемое расстояние между центрами подушечек в px (размер подушечки + зазор).
    // Формула размера та же, что у padPx в Canvas, — держать синхронно!
    fun fanWantPx(s: Float, pxPerDp: Float): Float {
        val zoomT = ((s - 1.3f) / 2.3f).coerceIn(0f, 1f)
        return (lerp(9f, 26f, zoomT) + 5f) * pxPerDp
    }

    // «Веер»: соседние точки мягко расталкиваются, пока не разойдутся на want.
    // Два прохода — чтобы кучка из 3–6 маркеров разъехалась красиво, а не в ряд.
    // Всё детерминированно зависит от масштаба, поэтому картинка не дрожит.
    fun relaxFan(want: Float, fan: Float) {
        fanOff.fill(0f)
        if (fan <= 0f) return
        val maxPush = want * 1.6f
        repeat(2) {
            for (i in 0 until map.points.size - 1) {
                if (!visible[i]) continue
                for (j in i + 1 until map.points.size) {
                    if (!visible[j]) continue
                    var dx = (basePos[j * 2] + fanOff[j * 2]) - (basePos[i * 2] + fanOff[i * 2])
                    var dy = (basePos[j * 2 + 1] + fanOff[j * 2 + 1]) - (basePos[i * 2 + 1] + fanOff[i * 2 + 1])
                    val d2 = dx * dx + dy * dy
                    if (d2 >= want * want) continue
                    val d = sqrt(d2)
                    if (d < 0.5f) {
                        // точки в одном пикселе: стабильное направление по «золотому углу»
                        val a = i * 2.399963f
                        dx = cos(a)
                        dy = sin(a)
                    } else {
                        dx /= d
                        dy /= d
                    }
                    val push = (want - d) * 0.5f * fan
                    fanOff[i * 2] = (fanOff[i * 2] - dx * push).coerceIn(-maxPush, maxPush)
                    fanOff[i * 2 + 1] = (fanOff[i * 2 + 1] - dy * push).coerceIn(-maxPush, maxPush)
                    fanOff[j * 2] = (fanOff[j * 2] + dx * push).coerceIn(-maxPush, maxPush)
                    fanOff[j * 2 + 1] = (fanOff[j * 2 + 1] + dy * push).coerceIn(-maxPush, maxPush)
                }
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBase)
            .onSizeChanged { viewport = it }
            // Тап: выбрать ближайшую точку (в радиусе 22dp) или снять выбор
            .pointerInput(map.points, activeTypes) {
                detectTapGestures { centroid ->
                    val vw = viewport.width.toFloat()
                    val vh = viewport.height.toFloat()
                    if (vw < 1f) return@detectTapGestures
                    val (bw, bh) = baseSize(vw, vh)
                    // та же геометрия, что у Canvas: тап ловит разъехавшийся маркер
                    fillBase(vw, vh, bw, bh, scale, panX, panY)
                    relaxFan(fanWantPx(scale, 1.dp.toPx()), fanStrength(scale))
                    var best = -1
                    var bestD = Float.MAX_VALUE
                    map.points.forEachIndexed { index, _ ->
                        if (!visible[index]) return@forEachIndexed
                        val dx = (basePos[index * 2] + fanOff[index * 2]) - centroid.x
                        val dy = (basePos[index * 2 + 1] + fanOff[index * 2 + 1]) - centroid.y
                        val d = dx * dx + dy * dy
                        if (d < bestD) {
                            bestD = d
                            best = index
                        }
                    }
                    val hit = 22.dp.toPx()
                    selectedPointIndex = if (best != -1 && bestD <= hit * hit) best else -1
                }
            }
            // Щипок — масштаб, палец — перемещение
            .pointerInput(Unit) {
                detectTransformGestures { centroid, drag, zoom, _ ->
                    val vw = viewport.width.toFloat()
                    val vh = viewport.height.toFloat()
                    if (vw < 1f || vh < 1f) return@detectTransformGestures

                    val old = scale
                    val new = (old * zoom).coerceIn(MIN_ZOOM, MAX_ZOOM)

                    // Приближаем «вокруг пальцев»: точка под серединой щипка остаётся на месте
                    val cx = centroid.x - vw / 2f
                    val cy = centroid.y - vh / 2f
                    val nx = cx - (cx - panX) / old * new + drag.x
                    val ny = cy - (cy - panY) / old * new + drag.y

                    val clamped = clampPan(nx, ny, new, vw, vh)
                    scale = new
                    panX = clamped.x
                    panY = clamped.y
                }
            }
    ) {
        // Само изображение карты
        Image(
            painter = painter,
            contentDescription = "Карта: ${map.name}",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                    translationX = panX
                    translationY = panY
                }
        )

        // — Все маркеры одним проходом отрисовки, адаптивные к зуму:
        //   отдалил — микро-точки цвета типа, приблизил — детальные значки —
        val glyphPainters = LootType.entries.associateWith { rememberVectorPainter(it.icon) }
        Canvas(Modifier.fillMaxSize()) {
            val vw = size.width
            val vh = size.height
            val (bw, bh) = baseSize(vw, vh)
            // 0 = карта отдалена (точки), 1 = приближена (детальные значки)
            val zoomT = ((scale - 1.3f) / 2.3f).coerceIn(0f, 1f)
            val padPx = lerp(9.dp.toPx(), 26.dp.toPx(), zoomT)
            val radius = padPx / 2f
            val dash = PathEffect.dashPathEffect(floatArrayOf(5.dp.toPx(), 4.dp.toPx()))
            val sel = selectedPointIndex

            // — «Веер»: маркеры, наехавшие друг на друга, расходятся в стороны —
            val fan = fanStrength(scale)
            fillBase(vw, vh, bw, bh, scale, panX, panY)
            relaxFan(fanWantPx(scale, 1.dp.toPx()), fan)

            // Золотые нити от разъехавшегося маркера к его настоящему месту
            if (fan > 0f) {
                val thread = AccentGold.copy(alpha = 0.55f * fan)
                val threadW = 1.dp.toPx()
                for (i in map.points.indices) {
                    if (!visible[i]) continue
                    val ox = fanOff[i * 2]
                    val oy = fanOff[i * 2 + 1]
                    if (ox == 0f && oy == 0f) continue
                    drawLine(
                        thread,
                        Offset(basePos[i * 2], basePos[i * 2 + 1]),
                        Offset(basePos[i * 2] + ox, basePos[i * 2 + 1] + oy),
                        strokeWidth = threadW
                    )
                }
            }

            // — Названия локаций: текст с тонкой тёмной окантовкой (1px);
            //   проступает при приближении и движется вместе с картой —
            val labelT = if (showLocations) ((scale - 1.4f) / 0.8f).coerceIn(0f, 1f) else 0f
            if (labelT > 0f) {
                locationLabels.forEach { (loc, layout) ->
                    val lx = vw / 2f + (loc.x - 0.5f) * bw * scale + panX
                    val ly = vh / 2f + (loc.y - 0.5f) * bh * scale + panY
                    if (lx < -layout.size.width || lx > vw + layout.size.width ||
                        ly < -layout.size.height || ly > vh + layout.size.height
                    ) return@forEach
                    val topLeft = Offset(lx - layout.size.width / 2f, ly - layout.size.height / 2f)
                    // Светлый текст с мягкой тенью вниз
                    drawText(
                        layout,
                        color = LocationTextColor,
                        topLeft = topLeft,
                        alpha = labelT,
                        shadow = Shadow(
                            color = LocationTextShadow,
                            offset = Offset(1.dp.toPx(), 2.dp.toPx()),
                            blurRadius = 3.dp.toPx()
                        )
                    )
                }
            }

            // локальная отрисовка одной точки (переиспользуется для выбранной)
            fun drawPoint(index: Int, point: LootPoint, boost: Float) {
                val ox = fanOff[index * 2]
                val oy = fanOff[index * 2 + 1]
                val cx = basePos[index * 2] + ox
                val cy = basePos[index * 2 + 1] + oy
                val cull = radius * 1.3f + abs(ox) + abs(oy)
                // отсечение: вне экрана не рисуем
                if (cx < -cull || cx > vw + cull || cy < -cull || cy > vh + cull) return
                val c = Offset(cx, cy)
                val r = radius * boost

                // подушечка: издалека — цвет типа лута, вблизи — тёмная
                drawCircle(lerp(point.type.color, Ink, zoomT), r, c)

                // золотое кольцо проявляется при приближении; у выбранного — сплошное
                if (index == sel) {
                    drawCircle(
                        AccentGold,
                        r - 1.dp.toPx() * zoomT,
                        c,
                        style = Stroke(width = 2.dp.toPx())
                    )
                } else if (zoomT > 0.25f) {
                    drawCircle(
                        AccentGold.copy(alpha = 0.85f * zoomT),
                        r - 1.dp.toPx() * zoomT,
                        c,
                        style = Stroke(width = 1.2.dp.toPx(), pathEffect = dash)
                    )
                }

                // значок проявляется при приближении — приглушённый, не кричит
                if (zoomT > 0.3f) {
                    val glyph = r * 0.96f
                    val glyphAlpha = ((zoomT - 0.3f) / 0.7f).coerceIn(0f, 1f) * 0.8f
                    with(glyphPainters.getValue(point.type)) {
                        withTransform({ translate(cx - glyph / 2f, cy - glyph / 2f) }) {
                            draw(
                                Size(glyph, glyph),
                                colorFilter = ColorFilter.tint(TextPrimary.copy(alpha = glyphAlpha))
                            )
                        }
                    }
                }
            }

            // проход 1: все точки, кроме выбранной
            map.points.forEachIndexed { index, point ->
                if (point.type !in activeTypes) return@forEachIndexed
                if (index == sel) return@forEachIndexed
                drawPoint(index, point, 1f)
            }

            // проход 2: выбранная точка — поверх всех, размер тот же
            map.points.getOrNull(sel)?.let { selPoint ->
                if (selPoint.type in activeTypes) {
                    drawPoint(sel, selPoint, 1f)
                }
            }
        }

        // Верхняя панель с градиентом: кнопки читаются на любом фоне
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .height(150.dp)
                .background(
                    Brush.verticalGradient(
                        0f to TopBarFade,
                        1f to Color.Transparent
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 12.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CircleIconButton(Icons.AutoMirrored.Outlined.ArrowBack, "Назад", onClick = onBack)
                Spacer(Modifier.width(12.dp))
                Text(
                    text = map.name,
                    style = MaterialTheme.typography.titleMedium,
                    color = TextPrimary,
                    modifier = Modifier.weight(1f)
                )
                CircleIconButton(Icons.Outlined.Info, "Легенда", onClick = onOpenLegend)
                Spacer(Modifier.width(8.dp))
                CircleIconButton(
                    icon = Icons.AutoMirrored.Outlined.Label,
                    contentDescription = if (showLocations) "Скрыть названия локаций" else "Показать названия локаций",
                    onClick = { showLocations = !showLocations },
                    showBadge = showLocations,
                    // золото = «функция включена», как у переключателей в фильтре
                    badgeColor = AccentGold
                )
                Spacer(Modifier.width(8.dp))
                CircleIconButton(
                    icon = Icons.Outlined.Tune,
                    contentDescription = "Фильтр",
                    onClick = { filtersOpen = true },
                    // красная точка = «внимание: часть типов скрыто»
                    showBadge = activeTypes.size < LootType.entries.size
                )
            }
        }

        // Кнопка «сбросить вид» — видна, только если карту двигали или приближали.
        // remember обязателен: без него объект состояния пересоздаётся при каждой
        // перерисовке, и Compose теряет возможность «не перерисовывать лишний раз».
        val viewMoved by remember {
            derivedStateOf { scale > 1.02f || panX != 0f || panY != 0f }
        }
        AnimatedVisibility(
            visible = viewMoved,
            enter = fadeIn() + scaleIn(),
            exit = fadeOut() + scaleOut(),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .navigationBarsPadding()
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
                        scale = 1f
                        panX = 0f
                        panY = 0f
                    },
                contentAlignment = Alignment.Center
            ) {
                // видимая кнопка: прежние 46.dp, центр зоны касания 48.dp
                Box(
                    Modifier
                        .size(46.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(AccentRed)
                        .border(1.dp, Ink, RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.CenterFocusWeak,
                        contentDescription = "Сбросить масштаб",
                        tint = TextPrimary,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
        }

        // Подсказка по управлению — исчезает через несколько секунд
        AnimatedVisibility(
            visible = hintVisible && !viewMoved,
            enter = fadeIn(),
            exit = fadeOut(),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .navigationBarsPadding()
                .padding(bottom = 24.dp)
        ) {
            Text(
                text = "Щипок — масштаб · палец — перемещение",
                style = MaterialTheme.typography.bodySmall,
                color = TextSecondary,
                modifier = Modifier
                    .clip(RoundedCornerShape(100.dp))
                    .background(BgBase.copy(alpha = 0.85f))
                    .border(1.dp, Outline.copy(alpha = 0.7f), RoundedCornerShape(100.dp))
                    .padding(horizontal = 14.dp, vertical = 8.dp)
            )
        }

        // — Подпись выбранной точки: название типа над маркером (у любой метки).
        //    Позиция читается в offset-лямбде — подпись движется вместе с картой
        //    и учитывает «веер» разъезда —
        val selPoint = selectedPoint
        selPoint?.let { point ->
            val idx = map.points.indexOf(point)
            PointTooltip(
                point = point,
                modifier = Modifier.offset {
                    val vw = viewport.width.toFloat()
                    val vh = viewport.height.toFloat()
                    if (vw < 1f || vh < 1f) return@offset IntOffset.Zero
                    val (bw, bh) = baseSize(vw, vh)
                    val px = vw / 2f + (point.x - 0.5f) * bw * scale + panX +
                        fanOff.getOrElse(idx * 2) { 0f }
                    val py = vh / 2f + (point.y - 0.5f) * bh * scale + panY +
                        fanOff.getOrElse(idx * 2 + 1) { 0f }
                    IntOffset(px.roundToInt(), py.roundToInt())
                }
            )
        }

        // — Карточка с фото выбранной кассы —
        selPoint?.photo?.let { photoName ->
            PhotoCard(
                photoName = photoName,
                onClick = { fullPhoto = true },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .navigationBarsPadding()
                    .padding(bottom = 56.dp)
            )
        }

        // Затемнение за панелью фильтра: тап по нему закрывает панель
        AnimatedVisibility(
            visible = filtersOpen,
            enter = fadeIn(),
            exit = fadeOut(),
            modifier = Modifier
                .align(Alignment.CenterStart)
                .fillMaxSize()
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(ScrimDark)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) { filtersOpen = false }
            )
        }

        // Панель фильтра выезжает справа
        AnimatedVisibility(
            visible = filtersOpen,
            enter = slideInHorizontally(initialOffsetX = { it }) + fadeIn(),
            exit = slideOutHorizontally(targetOffsetX = { it }) + fadeOut(),
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            FilterPanel(
                map = map,
                activeTypes = activeTypes,
                onToggle = { type ->
                    activeTypes = if (type in activeTypes) activeTypes - type else activeTypes + type
                },
                onShowAll = { activeTypes = LootType.entries.toSet() },
                onHideAll = { activeTypes = emptySet() },
                onClose = { filtersOpen = false }
            )
        }

        // — Полноэкранный просмотр фото —
        if (fullPhoto && selectedPoint?.photo != null) {
            FullscreenPhoto(
                photoName = selectedPoint.photo!!,
                onClose = { fullPhoto = false }
            )
        }
    }
}

/**
 * Подпись выбранной точки: небольшой тёмный ярлык над маркером.
 * Позиция приходит в modifier как отложенный offset — движется с картой.
 */
@Composable
private fun PointTooltip(point: LootPoint, modifier: Modifier = Modifier) {
    val text = if (point.note.isBlank()) point.type.label
    else "${point.type.label} · ${point.note}"

    Box(modifier = modifier) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodySmall,
            color = TextPrimary,
            modifier = Modifier
                .graphicsLayer {
                    translationX = -size.width / 2f
                    translationY = -size.height - 22.dp.toPx()
                }
                .clip(RoundedCornerShape(10.dp))
                .background(Color(0xE615181D))
                .border(1.dp, Outline, RoundedCornerShape(10.dp))
                .padding(horizontal = 10.dp, vertical = 6.dp)
        )
    }
}

/**
 * Загружает фото из assets/photos (уменьшая до maxDim по большей стороне).
 *
 * Раскодировка картинки — небыстрая операция, поэтому делается в фоне:
 * экран продолжает отзываться на пальцы, а когда фото готово — оно появляется.
 */
@Composable
private fun rememberAssetBitmap(name: String, maxDim: Int): ImageBitmap? {
    val context = LocalContext.current
    var bmp by remember(name, maxDim) { mutableStateOf<ImageBitmap?>(null) }
    LaunchedEffect(name, maxDim) {
        bmp = withContext(Dispatchers.IO) {
            runCatching {
                val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
                context.assets.open("photos/$name").use {
                    BitmapFactory.decodeStream(it, null, bounds)
                }
                var sample = 1
                while (maxOf(bounds.outWidth, bounds.outHeight) / sample > maxDim) sample *= 2
                val opts = BitmapFactory.Options().apply { inSampleSize = sample }
                context.assets.open("photos/$name").use {
                    BitmapFactory.decodeStream(it, null, opts)?.asImageBitmap()
                }
            }.getOrNull()
        }
    }
    return bmp
}

/**
 * Карточка с фото выбранной кассы (внизу экрана). Тап по ней — на весь экран.
 */
@Composable
private fun PhotoCard(photoName: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val bmp = rememberAssetBitmap(photoName, maxDim = 1400)
    if (bmp == null) return
    Image(
        bitmap = bmp,
        contentDescription = "Фото места",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .width(230.dp)
            .height(120.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(BgSurface.copy(alpha = 0.97f))
            .border(1.dp, AccentGold.copy(alpha = 0.55f), RoundedCornerShape(12.dp))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onClick
            )
    )
}

/**
 * Фото на весь экран. Тап в любом месте или «назад» — закрыть.
 */
@Composable
private fun FullscreenPhoto(photoName: String, onClose: () -> Unit) {
    BackHandler(onBack = onClose)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xF2000000))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onClose
            )
    ) {
        val bmp = rememberAssetBitmap(photoName, maxDim = 4096)
        if (bmp != null) {
            Image(
                bitmap = bmp,
                contentDescription = "Фото места",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize()
            )
        }
        CircleIconButton(
            icon = Icons.Outlined.Close,
            contentDescription = "Закрыть",
            onClick = onClose,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .statusBarsPadding()
                .padding(12.dp)
        )
    }
}
