package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

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
    AtomicDesignSampleTheme {
        Surface {
            HeadlineH2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH2 dark theme")
@Composable
fun PreviewHeadlineH2Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}