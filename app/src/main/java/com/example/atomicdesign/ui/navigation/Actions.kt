package com.example.atomicdesign.ui.navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

class Actions(navHostController: NavHostController) {

    val componentsIndexAction: () -> Unit = {
        navHostController.navigate(Routes.COMPONENT_INDEX)
    }

    val errorAction: () -> Unit = {
        navHostController.navigate(Routes.ERROR)
    }

}