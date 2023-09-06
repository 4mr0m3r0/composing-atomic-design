package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HeadlineH4(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineLarge
    )
}

@Preview("HeadlineH4 light theme")
@Composable
fun PreviewHeadlineH4Light() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            HeadlineH4(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH4 dark theme")
@Composable
fun PreviewHeadlineH4Dark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            HeadlineH4(text = "Lorem ipsum dolor sit amet.")
        }
    }
}