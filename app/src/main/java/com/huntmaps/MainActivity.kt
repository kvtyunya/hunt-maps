package com.huntmaps

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.huntmaps.ui.HuntMapsApp
import com.huntmaps.ui.theme.HuntMapsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Системные панели всегда под стиль приложения: прозрачные,
        // со светлыми значками — независимо от темы самого телефона.
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.dark(Color.TRANSPARENT)
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // убирает автоматическую белую подложку под кнопками навигации
            window.isNavigationBarContrastEnforced = false
        }

        setContent {
            HuntMapsTheme {
                HuntMapsApp()
            }
        }
    }
}
