package com.example.ui_components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme

@Composable
fun Body1(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.body1
    )
}

@Preview("TextBody1 light theme")
@Composable
fun PreviewBody1Light() {
    AtomicDesignSampleTheme {
        Surface {
            Body1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("TextBody1 dark theme")
@Composable
fun PreviewBody1Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            Body1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}