package com.example.ui_components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightThemeColors = lightColors(
    primary = Blue58a5f0,
    primaryVariant = Blue004c8c,
    secondary = Blue58a5f0
)

private val DarkThemeColors = darkColors(
    primary = Blue0277bd,
    primaryVariant = Blue004c8c,
    secondary = White
)

@Composable
fun AtomicDesignSampleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {

    MaterialTheme(
        colors = if (darkTheme) DarkThemeColors else LightThemeColors,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}