package com.example.atomicdesign.ui.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.atomicdesign.R
import com.example.atomicdesign.ui.navigation.Actions
import com.example.atomicdesign.ui.pages.listoflements.Element
import com.example.atomicdesign.ui.pages.listoflements.ListOfElements

@Composable
fun ComponentsIndexScreen(actions: Actions) {
    ListOfElements(
        elements = listOf(
            Element(
                text = "Buttons",
                onElementSelect = actions.buttons
            ),
            Element(
                text = "Error Template",
                onElementSelect = actions.error
            ),
            Element(
                text = "Filter Assist Chip",
                onElementSelect = actions.filterAssistChip
            ),
            Element(
                text = stringResource(R.string.navigation_bar_screen).replace(" Screen", ""),
                onElementSelect = actions.navigationBar
            ),
            Element(
                text = "Text Fields",
                onElementSelect = actions.textFields
            ),
            Element(
                text = "Type Scale",
                onElementSelect = actions.typeScale
            ),
        ),
        modifier = Modifier.fillMaxSize()
    )
}