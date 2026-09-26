package com.huntmaps.data

/*
 * Модели данных — «схема», по которой устроена информация в приложении.
 */

/**
 * Одна точка лута на карте.
 *
 * Важно: x и y — это доли, а не пиксели:
 *   x = 0.0 — левый край картинки,   x = 1.0 — правый край
 *   y = 0.0 — верхний край картинки, y = 1.0 — нижний край
 * Благодаря этому точки остаются на своих местах, даже если заменить
 * картинку на картинку другого разрешения.
 */
data class LootPoint(
    val type: LootType,
    val x: Float,
    val y: Float,
    val note: String = "", // подписка при нажатии на точку, например «У церкви»
    val photo: String? = null // имя файла фото из app/src/main/assets/photos/ (например, "kasca_1.webp")
)

/**
 * Название локации — подпись-ориентир на карте (усадьба, церковь, роща).
 * x и y — те же доли 0…1, что и у точек лута.
 */
data class MapLocation(
    val name: String,
    val x: Float,
    val y: Float
)

/**
 * Одна игровая локация.
 */
data class GameMap(
    val id: String,      // латиницей, без пробелов — используется в навигации
    val name: String,    // название, как оно показывается на экране
    val subtitle: String,// короткая строка-описание на карточке
    val imageRes: Int,   // ссылка на картинку из res/drawable-nodpi
    val points: List<LootPoint>,
    val locations: List<MapLocation> = emptyList() // подписи; списка может не быть
)
