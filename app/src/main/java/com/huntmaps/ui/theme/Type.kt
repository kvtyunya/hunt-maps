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
 * lnum — цифры одинаковой высоты на общей базовой линии;
 * tnum — одинаковая ширина цифр в счётчиках и номерах версий.
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
    headlineMedium = TextStyle( // главный заголовок экрана
        fontFeatureSettings = "'lnum' 1, 'tnum' 1",
        fontFamily = CormorantFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 44.sp,
        lineHeight = 48.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle( // заголовки экранов и панелей
        fontFeatureSettings = "'lnum' 1, 'tnum' 1",
        fontFamily = CormorantFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        letterSpacing = 0.3.sp
    ),
    titleMedium = TextStyle( // названия карточек и строк
        fontFeatureSettings = "'lnum' 1, 'tnum' 1",
        fontFamily = CormorantFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 25.sp
    ),
    bodyMedium = TextStyle(
        fontFeatureSettings = "'lnum' 1, 'tnum' 1",
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFeatureSettings = "'lnum' 1, 'tnum' 1",
        fontSize = 12.sp,
        lineHeight = 17.sp
    ),
    labelSmall = TextStyle( // «надзаголовки» вроде HUNT: SHOWDOWN 1896
        fontFeatureSettings = "'lnum' 1, 'tnum' 1",
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        letterSpacing = 2.sp
    )
)
