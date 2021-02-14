package com.example.atomicdesign.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Blue0277bd,
    primaryVariant = Blue004c8c,
    secondary = White
)

private val LightColorPalette = lightColors(
    primary = Blue58a5f0,
    primaryVariant = Blue004c8c,
    secondary = Blue58a5f0
)

@Composable
fun AtomicDesignSampleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}