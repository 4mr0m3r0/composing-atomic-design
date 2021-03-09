package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

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
    AtomicDesignSampleTheme {
        Surface {
            HeadlineH4(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH4 dark theme")
@Composable
fun PreviewHeadlineH4Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH4(text = "Lorem ipsum dolor sit amet.")
        }
    }
}