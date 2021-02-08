package com.example.atomicdesign.ui.components.templates.listoflements

data class Element(
    val text: String,
    val onElementSelect: () -> Unit
)