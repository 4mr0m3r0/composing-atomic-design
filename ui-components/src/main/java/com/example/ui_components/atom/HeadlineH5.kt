package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HeadlineH5(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview("HeadlineH5 light theme")
@Composable
fun PreviewHeadlineH5Light() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            HeadlineH5(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH5 dark theme")
@Composable
fun PreviewHeadlineH5Dark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            HeadlineH5(text = "Lorem ipsum dolor sit amet.")
        }
    }
}