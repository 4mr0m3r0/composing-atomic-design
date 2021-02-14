package com.example.atomicdesign.ui.components.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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

    }
}