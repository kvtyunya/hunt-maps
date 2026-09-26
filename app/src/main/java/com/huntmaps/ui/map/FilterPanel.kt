package com.huntmaps.ui.map

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.huntmaps.data.GameMap
import com.huntmaps.data.LootType
import com.huntmaps.ui.components.CircleIconButton
import com.huntmaps.ui.components.TypeBadge
import com.huntmaps.ui.components.fixHangingPrepositions
import com.huntmaps.ui.components.pointsLabel
import com.huntmaps.ui.theme.AccentGold
import com.huntmaps.ui.theme.BgPanel
import com.huntmaps.ui.theme.BgSurface
import com.huntmaps.ui.theme.Ink
import com.huntmaps.ui.theme.Outline
import com.huntmaps.ui.theme.TextPrimary
import com.huntmaps.ui.theme.TextSecondary

/*
 * ЭКРАН 3. Фильтр: боковая панель со всеми типами лута.
 * У каждого типа — значок с иконкой и цветом маркера и переключатель.
 */
@Composable
fun FilterPanel(
    map: GameMap,
    activeTypes: Set<LootType>,
    onToggle: (LootType) -> Unit,
    onShowAll: () -> Unit,
    onHideAll: () -> Unit,
    onClose: () -> Unit
) {
    val panelShape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp)

    Box(
        Modifier
            .fillMaxHeight()
            .width(300.dp)
            .clip(panelShape)
            .background(BgPanel)
            .border(1.dp, Outline, panelShape)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(horizontal = 20.dp)
        ) {
            Spacer(Modifier.height(18.dp))

            // Шапка панели
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(Modifier.weight(1f)) {
                    Text(
                        text = "ФИЛЬТРЫ",
                        style = MaterialTheme.typography.titleLarge,
                        color = TextPrimary
                    )
                    Spacer(Modifier.height(2.dp))
                    Text(
                        text = fixHangingPrepositions("Показано ${activeTypes.size} из ${LootType.entries.size}"),
                        style = MaterialTheme.typography.bodySmall,
                        color = TextSecondary
                    )
                }
                CircleIconButton(Icons.Outlined.Close, "Закрыть", onClick = onClose)
            }

            Spacer(Modifier.height(14.dp))

            // Быстрые действия
            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                TextButton(
                    onClick = onShowAll,
                    colors = ButtonDefaults.textButtonColors(contentColor = TextPrimary)
                ) {
                    Text("Включить все")
                }
                TextButton(
                    onClick = onHideAll,
                    colors = ButtonDefaults.textButtonColors(contentColor = TextPrimary)
                ) {
                    Text("Скрыть все")
                }
            }

            HorizontalDivider(color = Outline.copy(alpha = 0.6f), thickness = 1.dp)

            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(2.dp),
                contentPadding = PaddingValues(vertical = 8.dp)
            ) {
                items(LootType.entries) { type ->
                    FilterRow(
                        type = type,
                        count = map.points.count { it.type == type },
                        checked = type in activeTypes,
                        onToggle = { onToggle(type) }
                    )
                }
            }
        }
    }
}

@Composable
private fun FilterRow(
    type: LootType,
    count: Int,
    checked: Boolean,
    onToggle: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .clickable(onClick = onToggle)
            .padding(horizontal = 4.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TypeBadge(
            type = type,
            size = 40.dp,
            iconSize = 20.dp,
            // выключенный тип становится блёклым — состояние видно сразу
            modifier = Modifier.alpha(if (checked) 1f else 0.45f)
        )
        Spacer(Modifier.width(12.dp))
        Column(Modifier.weight(1f)) {
            Text(
                text = type.label,
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold),
                color = if (checked) TextPrimary else TextSecondary
            )
            Text(
                text = pointsLabel(count),
                style = MaterialTheme.typography.bodySmall,
                color = TextSecondary
            )
        }
        Switch(
            checked = checked,
            onCheckedChange = null, // нажатие обрабатывает вся строка
            colors = SwitchDefaults.colors(
                checkedThumbColor = Ink,
                checkedTrackColor = AccentGold,
                uncheckedThumbColor = TextSecondary,
                uncheckedTrackColor = BgSurface,
                uncheckedBorderColor = Outline
            )
        )
    }
}
