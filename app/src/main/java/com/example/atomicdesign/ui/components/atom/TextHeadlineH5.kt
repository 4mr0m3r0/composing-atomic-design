package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun TextHeadlineH5(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h5
    )
}

@Preview("TextHeadlineH5 light theme")
@Composable
fun PreviewTextHeadlineH5Light() {
    AtomicDesignSampleTheme {
        Surface {
            TextHeadlineH5(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("TextHeadlineH5 dark theme")
@Composable
fun PreviewTextHeadlineH5Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            TextHeadlineH5(text = "Lorem ipsum dolor sit amet.")
        }
    }
}