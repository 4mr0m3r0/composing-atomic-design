package com.example.atomicdesign.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.R
import com.example.ui_components.appbars.DefaultTopAppBar
import com.example.ui_components.atom.PrimaryButton
import com.example.ui_components.atom.SecondaryButton
import com.example.ui_components.theme.DesignSystemTheme

private val DEFAULT_PADDING = 50.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonsScreen() {
    Scaffold(
        topBar = {
            DefaultTopAppBar(stringResource(R.string.buttons_screen))
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(
                        start = DEFAULT_PADDING,
                        top = DEFAULT_PADDING,
                        end = DEFAULT_PADDING,
                        bottom = paddingValues.calculateBottomPadding()
                    )
                    .fillMaxSize()
            ) {
                PrimaryButton(
                    label = "Primary Button",
                    onClick = { },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.size(50.dp))
                SecondaryButton(
                    label = "Secondary Button",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    )
}

@Preview("ButtonsScreen light theme")
@Composable
fun PreviewErrorTemplateLight() {
    DesignSystemTheme {
        Surface {
            ButtonsScreen()
        }
    }
}

@Preview("ButtonsScreen dark theme")
@Composable
fun PreviewErrorTemplateDark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            ButtonsScreen()
        }
    }
}
