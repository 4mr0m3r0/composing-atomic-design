package com.example.ui_components.templates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_components.atom.Body1
import com.example.ui_components.atom.HeadlineH5
import com.example.ui_components.atom.PrimaryButton
import com.example.ui_components.theme.DesignSystemTheme

private val DEFAULT_PADDING = 50.dp

@Composable
fun ErrorTemplate(title: String, contentMsg: String, buttonLabel: String, buttonEvent: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(DEFAULT_PADDING)
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(100.dp))
        HeadlineH5(text = title)
        Spacer(modifier = Modifier.size(20.dp))
        Body1(text = contentMsg)
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
    DesignSystemTheme {
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
    DesignSystemTheme(darkTheme = true) {
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