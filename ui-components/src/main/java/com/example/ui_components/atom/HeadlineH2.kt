package com.example.ui_components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme

@Composable
fun HeadlineH2(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h2
    )
}

@Preview("HeadlineH2 light theme")
@Composable
fun PreviewHeadlineH2Light() {
    com.example.ui_components.theme.AtomicDesignSampleTheme {
        Surface {
            HeadlineH2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH2 dark theme")
@Composable
fun PreviewHeadlineH2Dark() {
    com.example.ui_components.theme.AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}