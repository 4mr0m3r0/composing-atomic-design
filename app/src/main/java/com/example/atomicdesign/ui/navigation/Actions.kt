package com.example.atomicdesign.ui.navigation

import androidx.navigation.NavHostController
import com.example.atomicdesign.ui.navigation.Routes.Buttons
import com.example.atomicdesign.ui.navigation.Routes.ComponentIndex
import com.example.atomicdesign.ui.navigation.Routes.Error
import com.example.atomicdesign.ui.navigation.Routes.FilterAssistChip
import com.example.atomicdesign.ui.navigation.Routes.NavigationBar
import com.example.atomicdesign.ui.navigation.Routes.TextFields
import com.example.atomicdesign.ui.navigation.Routes.TypeScale

class Actions(navHostController: NavHostController) {
    val componentsIndex: () -> Unit = { navHostController.navigate(ComponentIndex.path) }
    val buttons: () -> Unit = { navHostController.navigate(Buttons.path) }
    val error: () -> Unit = { navHostController.navigate(Error.path) }
    val filterAssistChip: () -> Unit = { navHostController.navigate(FilterAssistChip.path) }
    val navigationBar: () -> Unit = { navHostController.navigate(NavigationBar.path) }
    val textFields: () -> Unit = { navHostController.navigate(TextFields.path) }
    val typeScale: () -> Unit = { navHostController.navigate(TypeScale.path) }
    val goBack: () -> Unit = { navHostController.navigateUp() }
}