package com.example.atomicdesign.ui.pages.listoflements

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.atom.HorizontalDivider
import com.example.ui_components.lists.ElementRow
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun ListOfElements(
    elements: List<Element>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        itemsIndexed(elements) { index, element ->
            ElementRow(
                text = element.text,
                onElementSelect = element.onElementSelect
            )
            if (index < elements.size - 1) {
                HorizontalDivider()
            }
        }
    }
}

@Preview("ListOfElements light theme")
@Composable
fun PreviewListOfElementsLight() {
    DesignSystemTheme {
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
    DesignSystemTheme(darkTheme = true) {
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