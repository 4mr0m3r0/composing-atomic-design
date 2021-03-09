package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun Caption(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.caption
    )
}

@Preview("Caption light theme")
@Composable
fun PreviewCaptionLight() {
    AtomicDesignSampleTheme {
        Surface {
            Caption(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Caption dark theme")
@Composable
fun PreviewCaptionDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            Caption(text = "Lorem ipsum dolor sit amet.")
        }
    }
}