package com.example.atomicdesign.ui.components.templates.listoflements

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.components.atom.DefaultDivider
import com.example.atomicdesign.ui.components.molecules.ElementRow
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun ListOfElements(
    elements: List<Element>
) {
    LazyColumn {
        itemsIndexed(elements) { index, element ->
            ElementRow(
                text = element.text,
                onElementSelect = element.onElementSelect
            )
            if (index < elements.size - 1) {
                DefaultDivider()
            }
        }
    }
}

@Preview("ListOfElements light theme")
@Composable
fun PreviewListOfElementsLight() {
    AtomicDesignSampleTheme {
        Surface {
            ListOfElements(
                elements = listOf(
                    Element(text = "Element 1", onElementSelect = {}),
                    Element(text = "Element 2", onElementSelect = {}),
                    Element(text = "Element 3", onElementSelect = {}),
                    Element(text = "Element 4", onElementSelect = {}),
                    Element(text = "Element 5", onElementSelect = {}),
                )
            )
        }
    }
}

@Preview("ListOfElements dark theme")
@Composable
fun PreviewListOfElementsDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            ListOfElements(
                elements = listOf(
                    Element(text = "Element 1", onElementSelect = {}),
                    Element(text = "Element 2", onElementSelect = {}),
                    Element(text = "Element 3", onElementSelect = {}),
                    Element(text = "Element 4", onElementSelect = {}),
                    Element(text = "Element 5", onElementSelect = {}),
                )
            )
        }
    }
}