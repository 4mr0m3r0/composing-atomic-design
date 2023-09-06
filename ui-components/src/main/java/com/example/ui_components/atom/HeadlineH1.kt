package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HeadlineH1(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.displayLarge
    )
}

@Preview("HeadlineH1 light theme")
@Composable
fun PreviewHeadlineH1Light() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            HeadlineH1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH1 dark theme")
@Composable
fun PreviewHeadlineH1Dark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            HeadlineH1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}