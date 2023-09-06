package com.example.atomicdesign.ui.navigation

import androidx.navigation.NavHostController

class Actions(navHostController: NavHostController) {
    val componentsIndex: () -> Unit = { navHostController.navigate(Routes.COMPONENT_INDEX) }
    val buttons: () -> Unit = { navHostController.navigate(Routes.BUTTONS) }
    val error: () -> Unit = { navHostController.navigate(Routes.ERROR) }
    val filterAssistChip: () -> Unit = { navHostController.navigate(Routes.FILTER_ASSIST_CHIP) }
    val textFields: () -> Unit = { navHostController.navigate(Routes.TEXT_FIELDS) }
    val typeScale: () -> Unit = { navHostController.navigate(Routes.TYPE_SCALE) }
}