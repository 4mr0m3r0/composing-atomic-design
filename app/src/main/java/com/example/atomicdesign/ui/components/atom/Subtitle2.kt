package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun Subtitle2(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.subtitle2
    )
}

@Preview("Subtitle2 light theme")
@Composable
fun PreviewSubtitle2Light() {
    AtomicDesignSampleTheme {
        Surface {
            Subtitle2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Subtitle2 dark theme")
@Composable
fun PreviewSubtitle2Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            Subtitle2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}