package com.example.atomicdesign.ui.components.templates

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.components.atom.PrimaryButton
import com.example.atomicdesign.ui.components.atom.TextBody1
import com.example.atomicdesign.ui.components.atom.TextHeadlineH5
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

private val DEFAULT_PADDING = 50.dp

@Composable
fun ErrorTemplate(title: String, contentMsg: String, buttonLabel: String, buttonEvent: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(DEFAULT_PADDING)
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(100.dp))
        TextHeadlineH5(text = title)
        Spacer(modifier = Modifier.size(20.dp))
        TextBody1(text = contentMsg)
        Spacer(modifier = Modifier.size(100.dp))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            PrimaryButton(
                label = buttonLabel,
                onClick = buttonEvent
            )
        }
    }
}

@Preview("ErrorTemplate light theme")
@Composable
fun PreviewErrorTemplateLight() {
    AtomicDesignSampleTheme {
        Surface {
            ErrorTemplate(
                title = "Title",
                contentMsg = "This is an error message to visualize how it looks",
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
                contentMsg = "This is an error message to visualize how it looks",
                buttonLabel = "Label Button",
                buttonEvent = { }
            )
        }
    }
}