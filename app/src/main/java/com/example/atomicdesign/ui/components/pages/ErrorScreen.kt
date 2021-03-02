package com.example.atomicdesign.ui.components.pages

import androidx.compose.runtime.Composable
import com.example.atomicdesign.ui.components.templates.ErrorTemplate

@Composable
fun ErrorScreen() {
    
    ErrorTemplate(
        title = "Oh no!",
        contentMsg = "Something went wrong...",
        buttonLabel = "Retry",
        buttonEvent = { /*TODO*/ })
    
}