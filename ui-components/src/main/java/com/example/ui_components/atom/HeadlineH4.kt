package com.example.ui_components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme

@Composable
fun HeadlineH4(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h4
    )
}

@Preview("HeadlineH4 light theme")
@Composable
fun PreviewHeadlineH4Light() {
    com.example.ui_components.theme.AtomicDesignSampleTheme {
        Surface {
            HeadlineH4(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH4 dark theme")
@Composable
fun PreviewHeadlineH4Dark() {
    com.example.ui_components.theme.AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH4(text = "Lorem ipsum dolor sit amet.")
        }
    }
}