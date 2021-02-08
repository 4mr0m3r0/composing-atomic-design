package com.example.atomicdesign.ui.components.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.atomicdesign.ui.components.templates.listoflements.Element
import com.example.atomicdesign.ui.components.templates.listoflements.ListOfElements

@Composable
fun ComponentsIndex(modifier: Modifier = Modifier) {
    ListOfElements(elements = listOf(
        Element(text = "Element 1", onElementSelect = {}),
        Element(text = "Element 2", onElementSelect = {}),
        Element(text = "Element 3", onElementSelect = {}),
        Element(text = "Element 4", onElementSelect = {}),
        Element(text = "Element 5", onElementSelect = {}),
        Element(text = "Element 6", onElementSelect = {}),
        Element(text = "Element 7", onElementSelect = {}),
        Element(text = "Element 8", onElementSelect = {}),
        Element(text = "Element 9", onElementSelect = {}),
        Element(text = "Element 10", onElementSelect = {}),
        Element(text = "Element 11", onElementSelect = {}),
        Element(text = "Element 12", onElementSelect = {}),
        Element(text = "Element 13", onElementSelect = {}),
        Element(text = "Element 14", onElementSelect = {}),
    ))
}