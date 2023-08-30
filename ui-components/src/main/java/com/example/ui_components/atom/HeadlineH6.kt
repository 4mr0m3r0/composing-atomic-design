package com.example.ui_components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme

@Composable
fun HeadlineH6(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h6
    )
}

@Preview("HeadlineH6 light theme")
@Composable
fun PreviewHeadlineH6Light() {
    com.example.ui_components.theme.AtomicDesignSampleTheme {
        Surface {
            HeadlineH6(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH6 dark theme")
@Composable
fun PreviewHeadlineH6Dark() {
    com.example.ui_components.theme.AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH6(text = "Lorem ipsum dolor sit amet.")
        }
    }
}