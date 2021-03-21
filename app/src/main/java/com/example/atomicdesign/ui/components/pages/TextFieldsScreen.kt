package com.example.atomicdesign.ui.components.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.components.atom.EmailTextField
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

private val DEFAULT_PADDING = 50.dp

@Composable
fun TextFieldsScreen() {
    Column(
        modifier = Modifier
            .padding(DEFAULT_PADDING)
            .fillMaxWidth()
    ) {
        val emailText = remember { mutableStateOf("") }
        EmailTextField(
            label = "Email",
            emailText = emailText.value,
            onEmailChange = { emailText.value = it },
            imeAction = ImeAction.Done
        )
        Spacer(modifier = Modifier.size(50.dp))
    }
}

@Preview("TextFieldsScreen light theme")
@Composable
fun PreviewTextFieldsScreenLight() {
    AtomicDesignSampleTheme {
        Surface {
            TextFieldsScreen()
        }
    }
}

@Preview("TextFieldsScreen dark theme")
@Composable
fun PreviewTextFieldsScreenDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            TextFieldsScreen()
        }
    }
}