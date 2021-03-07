package com.example.atomicdesign.ui.components.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.components.atom.PrimaryButton
import com.example.atomicdesign.ui.components.atom.SecondaryButton
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

private val DEFAULT_PADDING = 50.dp

@Composable
fun ButtonsScreen() {
    Column(
        modifier = Modifier
            .padding(DEFAULT_PADDING)
            .fillMaxWidth()
    ) {
        PrimaryButton(
            label = "Primary Button",
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(50.dp))
        SecondaryButton(
            label = "Secondary Button",
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview("ButtonsScreen light theme")
@Composable
fun PreviewErrorTemplateLight() {
    AtomicDesignSampleTheme {
        Surface {
            ButtonsScreen()
        }
    }
}

@Preview("ButtonsScreen dark theme")
@Composable
fun PreviewErrorTemplateDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            ButtonsScreen()
        }
    }
}