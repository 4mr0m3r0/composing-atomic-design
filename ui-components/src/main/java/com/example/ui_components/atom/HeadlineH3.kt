package com.example.ui_components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme

@Composable
fun HeadlineH3(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h3
    )
}

@Preview("HeadlineH3 light theme")
@Composable
fun PreviewHeadlineH3Light() {
    com.example.ui_components.theme.AtomicDesignSampleTheme {
        Surface {
            HeadlineH3(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH3 dark theme")
@Composable
fun PreviewHeadlineH3Dark() {
    com.example.ui_components.theme.AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH3(text = "Lorem ipsum dolor sit amet.")
        }
    }
}