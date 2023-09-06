package com.example.atomicdesign.ui.pages

import androidx.compose.runtime.Composable
import com.example.ui_components.templates.ErrorTemplate

@Composable
fun ErrorScreen() {
    ErrorTemplate(
        title = "Oh no!",
        contentMsg = "Something went wrong...",
        buttonLabel = "Retry",
        buttonEvent = { /*TODO*/ })
}
