package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Subtitle1(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleLarge
    )
}

@Preview("Subtitle1 light theme")
@Composable
fun PreviewSubtitle1Light() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            Subtitle1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Subtitle1 dark theme")
@Composable
fun PreviewSubtitle1Dark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            Subtitle1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}