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
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun EmailTextField(
    label: String = "",
    emailText: String,
    onEmailChange: (String) -> Unit,
    imeAction: ImeAction = ImeAction.Next,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    OutlinedTextField(
        value = emailText,
        onValueChange = { onEmailChange(it) },
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email
        ).copy(imeAction = imeAction),
        keyboardActions = keyboardActions,
        maxLines = 1,
    )
}

@Preview("EmailTextField light mode")
@Composable
fun PreviewEmailTextFieldLight() {
    DesignSystemTheme {
        Surface {
            val (emailText, setEmailText) = remember { mutableStateOf("") }
            EmailTextField(
                label = "Email",
                emailText = emailText,
                onEmailChange = setEmailText
            )
        }
    }
}

@Preview("EmailTextField dark mode")
@Composable
fun PreviewEmailTextFieldDark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            val (emailText, setEmailText) = remember { mutableStateOf("") }
            EmailTextField(
                label = "Email",
                emailText = emailText,
                onEmailChange = setEmailText
            )
        }
    }
}