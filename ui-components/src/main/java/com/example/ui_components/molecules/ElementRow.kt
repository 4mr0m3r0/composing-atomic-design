package com.example.ui_components.molecules

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_components.atom.Body1
import com.example.ui_components.theme.DesignSystemTheme

private val DEFAULT_PADDING = 16.dp

@Composable
fun ElementRow(text: String, onElementSelect: () -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = onElementSelect)
            .padding(DEFAULT_PADDING)
            .fillMaxWidth()
    ) {
        Body1(text = text)
    }
}

@Preview("ElementRow light theme")
@Composable
fun PreviewElementRowLight() {
    DesignSystemTheme {
        Surface {
            ElementRow(text = "Lorem ipsum dolor sit amet.") { }
        }
    }
}

@Preview("ElementRow dark theme")
@Composable
fun PreviewElementRowDark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            ElementRow(text = "Lorem ipsum dolor sit amet.") { }
        }
    }
}