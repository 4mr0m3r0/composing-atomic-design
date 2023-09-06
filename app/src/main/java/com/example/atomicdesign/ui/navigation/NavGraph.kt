package com.example.atomicdesign.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.atomicdesign.ui.pages.ButtonsScreen
import com.example.atomicdesign.ui.pages.ComponentsIndexScreen
import com.example.atomicdesign.ui.pages.ErrorScreen
import com.example.atomicdesign.ui.pages.FilterAssistChipScreen
import com.example.atomicdesign.ui.pages.TextFieldsScreen
import com.example.atomicdesign.ui.pages.TypeScaleScreen

@Composable
fun NavGraph(startDestination: String = Routes.COMPONENT_INDEX) {
    val navController = rememberNavController()

    val actions = remember(navController) { Actions(navController) }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Routes.COMPONENT_INDEX) { ComponentsIndexScreen(actions = actions) }
        composable(Routes.BUTTONS) { ButtonsScreen() }
        composable(Routes.ERROR) { ErrorScreen() }
        composable(Routes.FILTER_ASSIST_CHIP) { FilterAssistChipScreen() }
        composable(Routes.TEXT_FIELDS) { TextFieldsScreen() }
        composable(Routes.TYPE_SCALE) { TypeScaleScreen() }
    }
}
