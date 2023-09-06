package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HeadlineH2(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.displayMedium
    )
}

@Preview("HeadlineH2 light theme")
@Composable
fun PreviewHeadlineH2Light() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            HeadlineH2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH2 dark theme")
@Composable
fun PreviewHeadlineH2Dark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            HeadlineH2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}