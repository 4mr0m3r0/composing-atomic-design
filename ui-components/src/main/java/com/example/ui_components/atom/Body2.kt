package com.example.ui_components.atom

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun Body2(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium
    )
}

@Preview("Body2 light theme")
@Composable
fun PreviewBody2Light() {
    DesignSystemTheme {
        Surface {
            Body2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Body2 dark theme")
@Composable
fun PreviewBody2Dark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            Body2(text = "Lorem ipsum dolor sit amet.")
        }
    }
}