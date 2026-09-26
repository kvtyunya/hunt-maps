package com.huntmaps.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val HuntColorScheme = darkColorScheme(
    primary = AccentGold,
    onPrimary = Ink,
    background = BgBase,
    onBackground = TextPrimary,
    surface = BgSurface,
    onSurface = TextPrimary,
    surfaceVariant = BgPanel,
    onSurfaceVariant = TextSecondary,
    outline = Outline
)

@Composable
fun HuntMapsTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = HuntColorScheme,
        typography = HuntTypography,
        content = content
    )
}
