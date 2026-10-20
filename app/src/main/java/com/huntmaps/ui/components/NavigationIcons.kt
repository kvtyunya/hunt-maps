package com.huntmaps.ui.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp

/** Thin navigation symbols shared with the exported portfolio previews. */
private fun navigationIcon(name: String, data: String, mirror: Boolean = false): ImageVector =
    ImageVector.Builder(
        name = name,
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
        autoMirror = mirror
    ).apply {
        addPath(
            pathData = PathParser().parsePathString(data).toNodes(),
            fill = null,
            stroke = SolidColor(Color.White),
            strokeLineWidth = 1.35f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        )
    }.build()

val NavigationBackIcon = navigationIcon(
    "NavigationBack", "M22,12H3 M7.5,7.5L3,12L7.5,16.5", mirror = true
)

val NavigationForwardIcon = navigationIcon(
    "NavigationForward", "M2,12H21 M16.5,7.5L21,12L16.5,16.5", mirror = true
)

val NavigationInfoIcon = navigationIcon(
    "NavigationInfo",
    "M12,2.75C6.89,2.75 2.75,6.89 2.75,12C2.75,17.11 6.89,21.25 12,21.25" +
        "C17.11,21.25 21.25,17.11 21.25,12C21.25,6.89 17.11,2.75 12,2.75Z " +
        "M12,7.3V7.5 M12,10.8V16.7"
)

val NavigationLocationsIcon = navigationIcon(
    "NavigationLocations", "M12,5L19,12L12,19L5,12Z"
)
