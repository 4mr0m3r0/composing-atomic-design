package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun Caption(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.labelLarge
    )
}

@Preview("Caption light theme")
@Composable
fun PreviewCaptionLight() {
    DesignSystemTheme {
        Surface {
            Caption(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Caption dark theme")
@Composable
fun PreviewCaptionDark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            Caption(text = "Lorem ipsum dolor sit amet.")
        }
    }
}