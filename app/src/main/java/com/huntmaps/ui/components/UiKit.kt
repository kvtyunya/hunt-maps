package com.huntmaps.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.huntmaps.data.LootType
import com.huntmaps.ui.theme.AccentGold
import com.huntmaps.ui.theme.BgSurface
import com.huntmaps.ui.theme.Ink
import com.huntmaps.ui.theme.TextPrimary

/**
 * Маркер в стиле игровых карт: тёмная подушечка, золотое пунктирное
 * кольцо и костяной значок внутри. У выбранного маркера кольцо сплошное.
 */
@Composable
fun MarkerPad(
    icon: ImageVector,
    label: String,
    size: Dp,
    iconSize: Dp,
    modifier: Modifier = Modifier,
    selected: Boolean = false
) {
    Box(modifier.size(size)) {
        Canvas(Modifier.fillMaxSize()) {
            val c = Offset(this.size.width / 2f, this.size.height / 2f)
            val r = this.size.minDimension / 2f

            drawCircle(color = Ink, radius = r, center = c)
            if (selected) {
                drawCircle(
                    color = AccentGold,
                    radius = r - 1.dp.toPx(),
                    center = c,
                    style = Stroke(width = 2.dp.toPx())
                )
            } else {
                drawCircle(
                    color = AccentGold.copy(alpha = 0.85f),
                    radius = r - 1.dp.toPx(),
                    center = c,
                    style = Stroke(
                        width = 1.2.dp.toPx(),
                        pathEffect = PathEffect.dashPathEffect(
                            floatArrayOf(5.dp.toPx(), 4.dp.toPx())
                        )
                    )
                )
            }
        }
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = TextPrimary,
            modifier = Modifier
                .align(Alignment.Center)
                .size(iconSize)
        )
    }
}

/**
 * Значок типа лута: тот же маркер-подушечка (в фильтре и легенде).
 */
@Composable
fun TypeBadge(
    type: LootType,
    size: Dp,
    iconSize: Dp,
    modifier: Modifier = Modifier
) {
    MarkerPad(
        icon = type.icon,
        label = type.label,
        size = size,
        iconSize = iconSize,
        modifier = modifier
    )
}

// Цвет точек-бейджей на кнопках — по смыслу, чтобы язык был единым:
//   BadgeRed (оттенок задан Екатериной) — «внимание: что-то скрыто»;
//   золото AccentGold — «функция включена», передаётся в badgeColor.
private val BadgeRed = Color(0xFFA92237)

/**
 * Квадратная кнопка в стиле сайта: прямые углы, тонкая костяная рамка.
 * Видимая кнопка — 42.dp (как задумано), но зона касания — 48.dp:
 * минимум Android, чтобы не промахиваться на бегу и в перчатке.
 * Лишнее поле невидимо и продолжается вокруг кнопки.
 * Если showBadge — крупный кружок налегает на верхний угол кнопки
 * (не обрезается: точка живёт в внешнем контейнере, клипуется только фон).
 * Цвет точки выбирается по смыслу: красный (по умолчанию) — «часть точек
 * скрыта», золото — «функция включена».
 */
@Composable
fun CircleIconButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    showBadge: Boolean = false,
    badgeColor: Color = BadgeRed
) {
    Box(modifier) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = onClick
                ),
            contentAlignment = Alignment.Center
        ) {
            // видимая кнопка: прежние 42.dp, центр зоны касания
            Box(
                Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(BgSurface.copy(alpha = 0.85f))
                    .border(1.dp, TextPrimary.copy(alpha = 0.3f), RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = contentDescription,
                    tint = TextPrimary,
                    modifier = Modifier.size(21.dp)
                )
            }
        }
        if (showBadge) {
            Box(
                Modifier
                    .align(Alignment.TopEnd)
                    // сдвиг от угла контейнера 48.dp, чтобы точка прижималась
                    // к углу видимой кнопки, как и раньше
                    .offset(x = (-1).dp, y = (-1).dp)
                    .size(15.dp)
                    .background(badgeColor, CircleShape)
            )
        }
    }
}

/**
 * Правильная русская форма слова: «1 точка», «3 точки», «5 точек».
 * Формы слова можно заменить, например на маркер/маркера/маркеров.
 */
fun pointsLabel(
    count: Int,
    one: String = "точка",
    few: String = "точки",
    many: String = "точек"
): String {
    val n10 = count % 10
    val n100 = count % 100
    val word = when {
        n10 == 1 && n100 != 11 -> one
        n10 in 2..4 && (n100 < 12 || n100 > 14) -> few
        else -> many
    }
    return "$count $word"
}

/** «1 маркер», «3 маркера», «5 маркеров» — счётчик на карточках карт. */
fun markerLabel(count: Int): String =
    pointsLabel(count, one = "маркер", few = "маркера", many = "маркеров")

// Русская типографика: предлоги и союзы из 1–2 букв не должны «висеть»
// в конце строки. После них ставится неразрывный пробел — при переносе
// предлог уходит на новую строку вместе со своим словом.
// Шаблон забирает всю цепочку («а на», «и в») целиком: иначе пробел
// съедает первое совпадение, а соседнее слово остаётся висячим.
private val HangingWord = Regex(
    "(^|[\\s«(—–])((?:и|в|к|о|с|у|а|на|за|из|от|по|до|не|ни|но|же|ли|бы|об|во|со|ко)" +
        "(?: (?:и|в|к|о|с|у|а|на|за|из|от|по|до|не|ни|но|же|ли|бы|об|во|со|ко))* )",
    RegexOption.IGNORE_CASE
)

/** «на карте» не разорвётся при переносе: предлог прилипает к слову. */
fun fixHangingPrepositions(text: String): String =
    text.replace(HangingWord) { m ->
        m.groupValues[1] + m.groupValues[2].replace(' ', '\u00A0')
    }
