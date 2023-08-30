package com.example.ui_components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme

@Composable
fun HeadlineH1(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h1
    )
}

@Preview("HeadlineH1 light theme")
@Composable
fun PreviewHeadlineH1Light() {
    com.example.ui_components.theme.AtomicDesignSampleTheme {
        Surface {
            HeadlineH1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH1 dark theme")
@Composable
fun PreviewHeadlineH1Dark() {
    com.example.ui_components.theme.AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}