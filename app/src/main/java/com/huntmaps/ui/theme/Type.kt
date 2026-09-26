@file:OptIn(androidx.compose.ui.text.ExperimentalTextApi::class)

package com.huntmaps.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.huntmaps.R

/*
 * Шрифты. Cormorant — книжная антиква с кириллицей (Google Fonts, свободная
 * лицензия OFL), ближайший бесплатный родственник заголовочного шрифта
 * официального сайта. Заголовки и названия карт — Cormorant,
 * обычный текст — системный sans (Roboto).
 */
val CormorantFamily = FontFamily(
    Font(
        resId = R.font.cormorant,
        weight = FontWeight.Medium,
        variationSettings = FontVariation.Settings(FontVariation.weight(500))
    ),
    Font(
        resId = R.font.cormorant,
        weight = FontWeight.SemiBold,
        variationSettings = FontVariation.Settings(FontVariation.weight(600))
    )
)

val HuntTypography = Typography(
    headlineMedium = TextStyle( // большой заголовок экрана («КАРТЫ»)
        fontFamily = CormorantFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 36.sp,
        letterSpacing = 2.sp
    ),
    titleLarge = TextStyle( // заголовки экранов и панелей
        fontFamily = CormorantFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        letterSpacing = 1.5.sp
    ),
    titleMedium = TextStyle( // названия карточек и строк
        fontFamily = CormorantFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontSize = 12.sp,
        lineHeight = 17.sp
    ),
    labelSmall = TextStyle( // «надзаголовки» вроде HUNT: SHOWDOWN 1896
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        letterSpacing = 2.sp
    )
)
