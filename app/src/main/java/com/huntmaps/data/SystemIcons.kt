package com.huntmaps.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp

/*
 * Системные значки интерфейса, нарисованные вручную (SVG-пути).
 * Позволили отказаться от библиотеки material-icons-extended (65 МБ кода).
 */
private fun icon(name: String, strokeD: String, fillD: String): ImageVector =
    ImageVector.Builder(
        name = name,
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            pathData = PathParser().parsePathString(strokeD).toNodes(),
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        )
        addPath(
            pathData = PathParser().parsePathString(fillD).toNodes(),
            fill = SolidColor(Color(0xFF000000))
        )
    }.build()

object SystemIcons {

    /** Ползунки фильтра (три линии с «бегунками»). */
    val FilterSliders: ImageVector = icon(
        name = "FilterSliders",
        strokeD = "M4 7H20M4 12H20M4 17H20",
        fillD = "M10 5a2 2 0 1 1 -4 0a2 2 0 1 1 4 0ZM18 10a2 2 0 1 1 -4 0a2 2 0 1 1 4 0Z" +
            "M12 15a2 2 0 1 1 -4 0a2 2 0 1 1 4 0Z"
    )

    /** Сброс вида: уголки рамки, кольцо и точка в центре. */
    val ResetView: ImageVector = icon(
        name = "ResetView",
        strokeD = "M4 9L4 4L9 4M15 4L20 4L20 9M20 15L20 20L15 20M9 20L4 20L4 15" +
            "M12 7a5 5 0 1 1 0 10a5 5 0 1 1 0 -10",
        fillD = "M12 10.4a1.6 1.6 0 1 1 0 3.2a1.6 1.6 0 1 1 0 -3.2Z"
    )
}
