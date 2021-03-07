package com.example.atomicdesign.ui.components.atom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun TextBody1(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.body1
    )
}

@Preview("TextBody1 light theme")
@Composable
fun PreviewTextBody1Light() {
    AtomicDesignSampleTheme {
        Surface {
            TextBody1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("TextBody1 dark theme")
@Composable
fun PreviewTextBody1Dark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            TextBody1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}