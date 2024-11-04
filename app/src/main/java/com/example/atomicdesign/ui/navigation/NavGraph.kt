package com.example.atomicdesign.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.atomicdesign.ui.navigation.Routes.Buttons
import com.example.atomicdesign.ui.navigation.Routes.ComponentIndex
import com.example.atomicdesign.ui.navigation.Routes.Error
import com.example.atomicdesign.ui.navigation.Routes.FilterAssistChip
import com.example.atomicdesign.ui.navigation.Routes.NavigationBar
import com.example.atomicdesign.ui.navigation.Routes.TextFields
import com.example.atomicdesign.ui.navigation.Routes.TypeScale
import com.example.atomicdesign.ui.pages.ButtonsScreen
import com.example.atomicdesign.ui.pages.ComponentsIndexScreen
import com.example.atomicdesign.ui.pages.ErrorScreen
import com.example.atomicdesign.ui.pages.FilterAssistChipScreen
import com.example.atomicdesign.ui.pages.TextFieldsScreen
import com.example.atomicdesign.ui.pages.TypeScaleScreen
import com.example.atomicdesign.ui.pages.navigation.NavigationBarScreen

@Composable
fun NavGraph(startDestination: String = ComponentIndex.path) {
    val navController = rememberNavController()

    val actions = remember(navController) { Actions(navController) }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ComponentIndex.path) { ComponentsIndexScreen(actions = actions) }
        composable(Buttons.path) { ButtonsScreen() }
        composable(Error.path) { ErrorScreen() }
        composable(FilterAssistChip.path) { FilterAssistChipScreen() }
        composable(NavigationBar.path) { NavigationBarScreen(navOnClick = actions.goBack) }
        composable(TextFields.path) { TextFieldsScreen() }
        composable(TypeScale.path) { TypeScaleScreen() }
    }
}
