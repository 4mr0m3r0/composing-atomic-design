package com.example.atomicdesign.ui.components.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.AtomicDesignSampleTheme
import com.example.atomicdesign.ui.components.atom.PrimaryButton
import com.example.atomicdesign.ui.components.atom.TextBody1
import com.example.atomicdesign.ui.components.atom.TextHeadlineH5

private val DEFAULT_PADDING = 16.dp

@Composable
fun ErrorTemplate(title: String, contentMsg: String, buttonLabel: String, buttonEvent: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(DEFAULT_PADDING)
    ) {
        TextHeadlineH5(text = title)
        TextBody1(text = contentMsg)
        PrimaryButton(label = buttonLabel, onClick = buttonEvent)
    }
}

@Preview("ErrorTemplate light theme")
@Composable
fun PreviewErrorTemplateLight() {
    AtomicDesignSampleTheme {
        Surface {
            ErrorTemplate(
                title = "Title",
                contentMsg = "Any body content message",
                buttonLabel = "Label Button",
                buttonEvent = { }
            )
        }
    }
}

@Preview("ErrorTemplate dark theme")
@Composable
fun PreviewErrorTemplateDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            ErrorTemplate(
                title = "Title",
                contentMsg = "Any body content message",
                buttonLabel = "Label Button",
                buttonEvent = { }
            )
        }
    }
}