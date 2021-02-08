package com.example.atomicdesign.ui.components.molecules

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.AtomicDesignSampleTheme
import com.example.atomicdesign.ui.components.atom.DefaultDivider
import com.example.atomicdesign.ui.components.atom.TextBody1

private val ALL_PADDING = 16.dp

@Composable
fun ElementRow(text: String, onElementSelect: () -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = onElementSelect)
            .padding(ALL_PADDING)
            .fillMaxWidth()
    ) {
        TextBody1(text = text)
    }
}

@Preview("ElementRow light theme")
@Composable
fun PreviewElementRowLight() {
    AtomicDesignSampleTheme {
        Surface {
            ElementRow(text = "Lorem ipsum dolor sit amet.") { }
        }
    }
}

@Preview("ElementRow dark theme")
@Composable
fun PreviewElementRowDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            ElementRow(text = "Lorem ipsum dolor sit amet.") { }
        }
    }
}