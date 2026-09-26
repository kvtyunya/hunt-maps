package com.huntmaps.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.huntmaps.ui.about.AboutScreen
import com.huntmaps.ui.home.HomeScreen
import com.huntmaps.ui.legend.LegendScreen
import com.huntmaps.ui.map.MapViewScreen

/*
 * Навигация приложения: четыре экрана.
 *   home          — выбор карты
 *   map/{mapId}   — экран карты (mapId подставляется при переходе)
 *   legend        — легенда маркеров
 *   about         — о приложении (версия, обратная связь, поддержка)
 */
@Composable
fun HuntMapsApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onMapSelected = { mapId -> navController.navigate("map/$mapId") },
                onOpenAbout = { navController.navigate("about") }
            )
        }
        composable("map/{mapId}") { backStackEntry ->
            MapViewScreen(
                mapId = backStackEntry.arguments?.getString("mapId"),
                onBack = { navController.popBackStack() },
                onOpenLegend = { navController.navigate("legend") }
            )
        }
        composable("legend") {
            LegendScreen(onBack = { navController.popBackStack() })
        }
        composable("about") {
            AboutScreen(onBack = { navController.popBackStack() })
        }
    }
}
