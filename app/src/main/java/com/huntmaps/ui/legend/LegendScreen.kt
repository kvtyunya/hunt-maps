package com.huntmaps.ui.legend

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.huntmaps.data.LootType
import com.huntmaps.ui.components.CircleIconButton
import com.huntmaps.ui.components.TypeBadge
import com.huntmaps.ui.components.fixHangingPrepositions
import com.huntmaps.ui.theme.BgBase
import com.huntmaps.ui.theme.BgSurface
import com.huntmaps.ui.theme.Outline
import com.huntmaps.ui.theme.TextPrimary
import com.huntmaps.ui.theme.TextSecondary

/*
 * ЭКРАН 4. Легенда: что означает каждый маркер.
 * Список строится из того же каталога типов, что и фильтр, —
 * добавишь тип в одном месте, и он появится везде.
 */
@Composable
fun LegendScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBase)
            .statusBarsPadding()
    ) {
        // Верхняя панель
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircleIconButton(Icons.AutoMirrored.Outlined.ArrowBack, "Назад", onClick = onBack)
            Spacer(Modifier.width(12.dp))
            Text(
                text = "ЛЕГЕНДА",
                style = MaterialTheme.typography.titleLarge,
                color = TextPrimary
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .navigationBarsPadding(),
            contentPadding = PaddingValues(start = 20.dp, end = 20.dp, top = 6.dp, bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(BgSurface)
                        .border(1.dp, Outline.copy(alpha = 0.6f), RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Text(
                        text = fixHangingPrepositions(
                            "Маркеры показывают, где обычно появляется лут. " +
                                "Включай в фильтре только то, что ищешь, — карта останется чистой."
                        ),
                        style = MaterialTheme.typography.bodySmall,
                        color = TextSecondary
                    )
                }
            }

            items(LootType.entries) { type ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(BgSurface)
                        .border(1.dp, Outline.copy(alpha = 0.6f), RoundedCornerShape(12.dp))
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TypeBadge(type = type, size = 44.dp, iconSize = 22.dp)
                    Spacer(Modifier.width(14.dp))
                    Column {
                        Text(
                            text = type.label,
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = FontWeight.SemiBold
                            ),
                            color = TextPrimary
                        )
                        Spacer(Modifier.height(3.dp))
                        Text(
                            text = fixHangingPrepositions(type.description),
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                }
            }
        }
    }
}
