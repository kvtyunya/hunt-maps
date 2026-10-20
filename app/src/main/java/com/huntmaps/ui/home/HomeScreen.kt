package com.huntmaps.ui.home

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.huntmaps.R
import com.huntmaps.data.GameMap
import com.huntmaps.data.MapData
import com.huntmaps.ui.components.NavigationForwardIcon
import com.huntmaps.ui.components.CircleIconButton
import com.huntmaps.ui.components.pointsLabel
import com.huntmaps.ui.theme.AccentGold
import com.huntmaps.ui.theme.BgBase
import com.huntmaps.ui.theme.Outline
import com.huntmaps.ui.theme.TextPrimary
import com.huntmaps.ui.theme.TextSecondary

/*
 * ЭКРАН 1. Выбор карты: вертикальный список локаций, как в навигационных
 * приложениях — каждая карточка на всю ширину с пейзажной обложкой.
 * Обложки декоративные: изображение самой игровой карты не заменяется.
 * В шапке — сердечко: ведёт на экран «О приложении» (версия, обратная
 * связь, поддержка разработчика).
 */
@Composable
fun HomeScreen(
    onMapSelected: (String) -> Unit,
    onOpenAbout: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBase)
            .statusBarsPadding()
    ) {
        // Шапка: заголовок слева, сердечко «О приложении» справа
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 14.dp, top = 20.dp, bottom = 18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.weight(1f)) {
                Text(
                    text = "HUNT: SHOWDOWN 1896",
                    style = MaterialTheme.typography.labelSmall,
                    color = AccentGold.copy(alpha = 0.9f)
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "Карты",
                    style = MaterialTheme.typography.headlineMedium,
                    color = TextPrimary
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    text = "Выберите территорию",
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextSecondary
                )
            }
            CircleIconButton(
                icon = Icons.Outlined.FavoriteBorder,
                contentDescription = "О приложении",
                onClick = onOpenAbout,
                modifier = Modifier.align(Alignment.Top).padding(top = 2.dp)
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(MapData.maps, key = { it.id }) { map ->
                MapCard(map = map, onClick = { onMapSelected(map.id) })
            }
            item {
                Text(
                    text = "Все карты доступны офлайн",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth().navigationBarsPadding().padding(top = 4.dp)
                )
            }
        }
    }
}

@Composable
private fun MapCard(map: GameMap, onClick: () -> Unit) {
    // Лёгкий эффект «нажатия»: карточка чуть уменьшается
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    val scale by animateFloatAsState(
        targetValue = if (pressed) 0.98f else 1f,
        label = "cardScale"
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 138.dp)
            .aspectRatio(2.5f)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, Outline.copy(alpha = 0.8f), RoundedCornerShape(12.dp))
            .clickable(
                interactionSource = interaction,
                indication = null,
                onClick = onClick
            )
    ) {
        Image(
            painter = painterResource(coverFor(map)),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Затемнение снизу — чтобы название читалось на любой картинке
        Box(
            Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        0f to Color.Transparent,
                        0.25f to Color(0x10111210),
                        1f to Color(0xF2111210)
                    )
                )
        )
        Row(
            Modifier
                .align(Alignment.BottomStart)
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 14.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Column(Modifier.weight(1f).padding(end = 12.dp)) {
                Text(
                    text = map.name,
                    style = MaterialTheme.typography.titleMedium.copy(fontSize = 25.sp, lineHeight = 27.sp),
                    color = TextPrimary
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    text = pointsLabel(map.points.size),
                    style = MaterialTheme.typography.bodySmall,
                    color = TextPrimary.copy(alpha = 0.85f)
                )
            }
            Icon(
                imageVector = NavigationForwardIcon,
                contentDescription = null,
                tint = TextPrimary,
                modifier = Modifier.padding(bottom = 4.dp).size(22.dp)
            )
        }
    }
}

private fun coverFor(map: GameMap): Int = when (map.id) {
    "stillwater" -> R.drawable.cover_stillwater
    "lawson" -> R.drawable.cover_lawson
    "mammon" -> R.drawable.cover_mammon
    "desalle" -> R.drawable.cover_desalle
    else -> map.imageRes
}
