package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HeadlineH6(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineSmall
    )
}

@Preview("HeadlineH6 light theme")
@Composable
fun PreviewHeadlineH6Light() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            HeadlineH6(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH6 dark theme")
@Composable
fun PreviewHeadlineH6Dark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            HeadlineH6(text = "Lorem ipsum dolor sit amet.")
        }
    }
}