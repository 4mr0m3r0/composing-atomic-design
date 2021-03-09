package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun HeadlineH5(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h5
    )
}

@Preview("HeadlineH5 light theme")
@Composable
fun PreviewHeadlineH5Light() {
    AtomicDesignSampleTheme {
        Surface {
            HeadlineH5(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("HeadlineH5 dark theme")
@Composable
fun PreviewHeadlineH5Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            HeadlineH5(text = "Lorem ipsum dolor sit amet.")
        }
    }
}