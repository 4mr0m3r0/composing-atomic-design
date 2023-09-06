package com.example.ui_components.atom

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PasswordTextField(
    label: String = "",
    passwordText: String,
    onPasswordChange: (String) -> Unit,
    imeAction: ImeAction = ImeAction.Next,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    OutlinedTextField(
        value = passwordText,
        onValueChange = { onPasswordChange(it) },
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ).copy(imeAction = imeAction),
        keyboardActions = keyboardActions,
        visualTransformation = PasswordVisualTransformation(),
        maxLines = 1
    )
}

@Preview("PasswordTextField light mode")
@Composable
fun PreviewPasswordTextFieldLight() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            val (passwordText, setPasswordText) = remember { mutableStateOf("") }
            PasswordTextField(
                label = "Password",
                passwordText = passwordText,
                onPasswordChange = setPasswordText
            )
        }
    }
}

@Preview("PasswordTextField dark mode")
@Composable
fun PreviewPasswordTextFieldDark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            val (passwordText, setPasswordText) = remember { mutableStateOf("") }
            PasswordTextField(
                label = "Password",
                passwordText = passwordText,
                onPasswordChange = setPasswordText
            )
        }
    }
}