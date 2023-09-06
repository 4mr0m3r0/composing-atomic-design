package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun Subtitle2(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleMedium
    )
}

@Preview("Subtitle2 light theme")
@Composable
fun PreviewSubtitle2Light() {
    DesignSystemTheme {
        Surface {
            Subtitle2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Subtitle2 dark theme")
@Composable
fun PreviewSubtitle2Dark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            Subtitle2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}