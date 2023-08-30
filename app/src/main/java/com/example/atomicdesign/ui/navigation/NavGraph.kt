package com.example.atomicdesign.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.atomicdesign.ui.pages.ButtonsScreen
import com.example.atomicdesign.ui.pages.ComponentsIndexScreen
import com.example.atomicdesign.ui.pages.ErrorScreen
import com.example.atomicdesign.ui.pages.TextFieldsScreen
import com.example.atomicdesign.ui.pages.TypeScaleScreen

@Composable
fun NavGraph(startDestination: String = Routes.COMPONENT_INDEX_SCREEN) {
    val navController = rememberNavController()

    val actions = remember(navController) { Actions(navController) }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Routes.COMPONENT_INDEX_SCREEN) {
            ComponentsIndexScreen(
                buttonsAction = actions.buttonsAction,
                errorTemplateAction = actions.errorAction,
                textFieldsAction = actions.textFieldsAction,
                typeScaleAction = actions.typeScaleAction,
            )
        }
        composable(Routes.BUTTONS_SCREEN) {
            ButtonsScreen()
        }
        composable(Routes.ERROR_SCREEN) {
            ErrorScreen()
        }
        composable(Routes.TEXT_FIELDS_SCREEN) {
            TextFieldsScreen()
        }
        composable(Routes.TYPE_SCALE_SCREEN) {
            TypeScaleScreen()
        }
    }
}
