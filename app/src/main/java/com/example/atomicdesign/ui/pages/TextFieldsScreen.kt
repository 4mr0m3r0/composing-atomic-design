package com.example.atomicdesign.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_components.atom.EmailTextField
import com.example.ui_components.atom.PasswordTextField
import com.example.ui_components.theme.DesignSystemTheme

private val DEFAULT_PADDING = 50.dp

@Composable
fun TextFieldsScreen() {
    Column(
        modifier = Modifier
            .padding(DEFAULT_PADDING)
            .fillMaxSize()
    ) {
        val (emailText, setEmailText) = remember { mutableStateOf("") }
        EmailTextField(
            label = "Email",
            emailText = emailText,
            onEmailChange = setEmailText,
        )
        Spacer(modifier = Modifier.size(50.dp))
        val (passwordText, setPasswordText) = remember { mutableStateOf("") }
        PasswordTextField(
            label = "Password",
            passwordText = passwordText,
            onPasswordChange = setPasswordText,
            imeAction = ImeAction.Done,
            keyboardActions = KeyboardActions(
                onDone = {
                    println("onDone Action")
                }
            )
        )
    }
}

@Preview("TextFieldsScreen light theme")
@Composable
fun PreviewTextFieldsScreenLight() {
    DesignSystemTheme {
        Surface {
            TextFieldsScreen()
        }
    }
}

@Preview("TextFieldsScreen dark theme")
@Composable
fun PreviewTextFieldsScreenDark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            TextFieldsScreen()
        }
    }
}
