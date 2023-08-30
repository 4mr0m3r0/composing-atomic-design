package com.example.ui_components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme

@Composable
fun Body2(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.body2
    )
}

@Preview("Body2 light theme")
@Composable
fun PreviewBody2Light() {
    AtomicDesignSampleTheme {
        Surface {
            Body2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Body2 dark theme")
@Composable
fun PreviewBody2Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            Body2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}