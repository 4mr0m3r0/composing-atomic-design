package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun Body1(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge
    )
}

@Preview("TextBody1 light theme")
@Composable
fun PreviewBody1Light() {
    DesignSystemTheme {
        Surface {
            Body1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("TextBody1 dark theme")
@Composable
fun PreviewBody1Dark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            Body1(text = "Lorem ipsum dolor sit amet.")
        }
    }
}