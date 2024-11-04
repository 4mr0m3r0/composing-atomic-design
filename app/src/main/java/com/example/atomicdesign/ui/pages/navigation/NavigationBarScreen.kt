package com.example.atomicdesign.ui.pages.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.atomicdesign.R
import com.example.ui_components.appbars.DefaultTopAppBar
import com.example.ui_components.navigation.DefaultNavigationBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationBarScreen(navOnClick: () -> Unit) {
    Scaffold(
        topBar = {
            DefaultTopAppBar(
                title = stringResource(R.string.navigation_bar_screen),
                navOnClick = navOnClick
            )
        },
        bottomBar = {
            DefaultNavigationBar(
                textItems = listOf("Song", "Artists", "Playlist"),
                selectedIcons = listOf(
                    Icons.Filled.Home,
                    Icons.Filled.Favorite,
                    Icons.Filled.Star
                ),
                unselectedIcons = listOf(
                    Icons.Outlined.Home,
                    Icons.Outlined.FavoriteBorder,
                    Icons.Outlined.StarBorder
                )
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(
                        bottom = paddingValues.calculateBottomPadding()
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Navigation Bar sample")
            }
        }
    )
}