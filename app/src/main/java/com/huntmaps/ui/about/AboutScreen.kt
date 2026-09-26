package com.huntmaps.ui.about

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.huntmaps.ui.components.CircleIconButton
import com.huntmaps.ui.components.fixHangingPrepositions
import com.huntmaps.ui.theme.AccentGold
import com.huntmaps.ui.theme.BgBase
import com.huntmaps.ui.theme.BgSurface
import com.huntmaps.ui.theme.Outline
import com.huntmaps.ui.theme.TextPrimary
import com.huntmaps.ui.theme.TextSecondary

/*
 * ══════════════════════════════════════════════════════════════════
 *  ССЫЛКИ ЭКРАНА «О ПРИЛОЖЕНИИ» (понадобятся при смене):
 *
 *  SUPPORT_URL  — донаты, страница CloudTips
 *  FEEDBACK_URL — обратная связь: почта в формате "mailto:адрес",
 *                 тема письма подставляется автоматически
 * ══════════════════════════════════════════════════════════════════
 */
private const val SUPPORT_URL = "https://pay.cloudtips.ru/p/e8d3c3ee"
private const val FEEDBACK_URL = "mailto:kvtyunya@mail.ru?subject=Hunt%20Maps"

/*
 * ЭКРАН «О ПРИЛОЖЕНИИ»: версия, обратная связь и поддержка разработчика.
 * Открывается с сердечка в шапке главного экрана. Ссылки — в константах
 * SUPPORT_URL и FEEDBACK_URL в начале файла.
 */
@Composable
fun AboutScreen(onBack: () -> Unit) {
    val context = LocalContext.current

    // Версия берётся из настроек сборки (versionName), чтобы не разошлась
    val versionName = remember {
        try {
            context.packageManager.getPackageInfo(context.packageName, 0).versionName
        } catch (_: Exception) {
            null
        }
    }

    fun openLink(url: String) {
        try {
            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        } catch (_: ActivityNotFoundException) {
            // Браузера нет — просто ничего не делаем
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBase)
            .statusBarsPadding()
    ) {
        // Верхняя панель — как на легенде
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircleIconButton(Icons.AutoMirrored.Outlined.ArrowBack, "Назад", onClick = onBack)
            Spacer(Modifier.width(12.dp))
            Text(
                text = "О ПРИЛОЖЕНИИ",
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
            // Шапка: название и версия
            item {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(BgSurface)
                        .border(1.dp, Outline.copy(alpha = 0.6f), RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Text(
                            text = "HUNT MAPS",
                            style = MaterialTheme.typography.labelSmall,
                            color = AccentGold
                        )
                        Spacer(Modifier.height(6.dp))
                        Text(
                            text = "Карты Hunt: Showdown 1896",
                            style = MaterialTheme.typography.titleLarge,
                            color = TextPrimary
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = buildString {
                                append("Версия ")
                                append(versionName ?: "—")
                            },
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                }
            }

            // Обратная связь
            item {
                AboutActionRow(
                    icon = Icons.Outlined.Email,
                    title = "Обратная связь",
                    subtitle = "Нашли ошибку на карте или есть идея? Напишите — " +
                        "так карты становятся точнее."
                ) { openLink(FEEDBACK_URL) }
            }

            // Поддержка разработчика
            item {
                AboutActionRow(
                    icon = Icons.Outlined.Favorite,
                    iconTint = AccentGold,
                    title = "Поддержать разработчика",
                    subtitle = "Приложение бесплатное. Откроется страница чаевых — " +
                        "подойдёт карта любого банка."
                ) { openLink(SUPPORT_URL) }
            }

            // Тихий финал
            item {
                Text(
                    text = fixHangingPrepositions(
                        "Спасибо, что играете с Hunt Maps — " +
                            "каждая чашка кофе помогает картам обновляться."
                    ),
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                )
            }
        }
    }
}

/**
 * Строка-кнопка на всю ширину: значок, заголовок, пояснение.
 * Нажимается вся карточка целиком — не надо целиться в текст.
 */
@Composable
private fun AboutActionRow(
    icon: ImageVector,
    title: String,
    subtitle: String,
    iconTint: Color = TextPrimary,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(BgSurface)
            .border(1.dp, Outline.copy(alpha = 0.6f), RoundedCornerShape(12.dp))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onClick
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(BgBase)
                .border(1.dp, Outline.copy(alpha = 0.6f), RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = iconTint,
                modifier = Modifier.size(22.dp)
            )
        }
        Spacer(Modifier.width(14.dp))
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.SemiBold
                ),
                color = TextPrimary
            )
            Spacer(Modifier.height(3.dp))
            Text(
                text = fixHangingPrepositions(subtitle),
                style = MaterialTheme.typography.bodySmall,
                color = TextSecondary
            )
        }
    }
}
