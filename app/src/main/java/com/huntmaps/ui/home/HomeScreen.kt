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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
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
import androidx.compose.ui.unit.dp
import com.huntmaps.data.GameMap
import com.huntmaps.data.MapData
import com.huntmaps.ui.components.CircleIconButton
import com.huntmaps.ui.components.markerLabel
import com.huntmaps.ui.theme.AccentGold
import com.huntmaps.ui.theme.BgBase
import com.huntmaps.ui.theme.Outline
import com.huntmaps.ui.theme.TextPrimary
import com.huntmaps.ui.theme.TextSecondary

/*
 * ЭКРАН 1. Выбор карты: вертикальный список локаций, как в навигационных
 * приложениях — каждая карточка на всю ширину с картой-превью.
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
                .padding(start = 20.dp, end = 12.dp, top = 24.dp, bottom = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.weight(1f)) {
                Text(
                    text = "HUNT: SHOWDOWN 1896",
                    style = MaterialTheme.typography.labelSmall,
                    color = AccentGold
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    text = "КАРТЫ",
                    style = MaterialTheme.typography.headlineMedium,
                    color = TextPrimary
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = "Выберите локацию",
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextSecondary
                )
            }
            CircleIconButton(
                icon = Icons.Outlined.Favorite,
                contentDescription = "О приложении",
                onClick = onOpenAbout
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(start = 20.dp, end = 20.dp, bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(MapData.maps, key = { it.id }) { map ->
                MapCard(map = map, onClick = { onMapSelected(map.id) })
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
            .aspectRatio(2.1f)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, Outline.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
            .clickable(
                interactionSource = interaction,
                indication = null,
                onClick = onClick
            )
    ) {
        Image(
            painter = painterResource(map.imageRes),
            contentDescription = map.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Затемнение снизу — чтобы название читалось на любой картинке
        Box(
            Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        0.4f to Color.Transparent,
                        1f to Color(0xE614110C)
                    )
                )
        )
        Column(
            Modifier
                .align(Alignment.BottomStart)
                .padding(start = 16.dp, end = 16.dp, bottom = 14.dp)
        ) {
            // Золотая линия с круглыми концами — в цвет надписи HUNT: SHOWDOWN 1896
            Box(
                Modifier
                    .padding(bottom = 7.dp)
                    .size(width = 30.dp, height = 2.5.dp)
                    .clip(CircleShape)
                    .background(AccentGold)
            )
            Text(
                text = map.name,
                style = MaterialTheme.typography.titleMedium,
                color = TextPrimary
            )
            Spacer(Modifier.height(2.dp))
            Text(
                text = markerLabel(map.points.size),
                style = MaterialTheme.typography.bodySmall,
                color = TextSecondary
            )
        }
    }
}
