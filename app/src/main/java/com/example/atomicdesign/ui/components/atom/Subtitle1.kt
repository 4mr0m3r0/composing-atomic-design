package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun Subtitle1(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.subtitle1
    )
}

@Preview("Subtitle1 light theme")
@Composable
fun PreviewSubtitle1Light() {
    AtomicDesignSampleTheme {
        Surface {
            Subtitle1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Subtitle1 dark theme")
@Composable
fun PreviewSubtitle1Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            Subtitle1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}