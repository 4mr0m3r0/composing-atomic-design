package com.example.ui_components.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun DefaultNavigationBar(
    textItems: List<String>,
    selectedIcons: List<ImageVector>,
    unselectedIcons: List<ImageVector>,
    modifier: Modifier = Modifier,
    defaultSelectedItem: Int = 0,
) {
    var selectedItem by remember { mutableIntStateOf(defaultSelectedItem) }
    NavigationBar(modifier = modifier) {
        textItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}
