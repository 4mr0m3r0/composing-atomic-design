package com.example.atomicdesign.ui.pages.listoflements

data class Element(
    val text: String,
    val onElementSelect: () -> Unit
)