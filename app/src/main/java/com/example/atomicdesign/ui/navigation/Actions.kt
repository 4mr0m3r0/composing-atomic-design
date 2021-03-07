package com.example.atomicdesign.ui.navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

class Actions(navHostController: NavHostController) {

    val componentsIndexAction: () -> Unit = {
        navHostController.navigate(Routes.COMPONENT_INDEX_SCREEN)
    }

    val buttonsAction: () -> Unit = {
        navHostController.navigate(Routes.BUTTONS_SCREEN)
    }

    val errorAction: () -> Unit = {
        navHostController.navigate(Routes.ERROR_SCREEN)
    }

}