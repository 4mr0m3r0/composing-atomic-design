package com.example.atomicdesign.ui.components.atom

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.AtomicDesignSampleTheme

private val defaultSpacerSize = 16.dp

@Composable
fun ListItemAtm(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.body1,
        modifier = Modifier.padding(defaultSpacerSize)
    )
}

@Preview("ComponentItem light theme")
@Composable
fun PreviewComponentItem() {
    AtomicDesignSampleTheme {
        Surface {
            ListItemAtm(text = "Lorem ipsum dolor sit amet.")
        }
    }
}

@Preview("Component Item dark theme")
@Composable
fun PreviewComponentItemDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            ListItemAtm(text = "Lorem ipsum dolor sit amet.")
        }
    }
}