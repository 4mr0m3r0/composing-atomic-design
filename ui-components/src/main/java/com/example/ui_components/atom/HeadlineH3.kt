package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HeadlineH3(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.displaySmall
    )
}

@Preview("HeadlineH3 light theme")
@Composable
fun PreviewHeadlineH3Light() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            HeadlineH3(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH3 dark theme")
@Composable
fun PreviewHeadlineH3Dark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            HeadlineH3(text = "Lorem ipsum dolor sit amet.")
        }
    }
}