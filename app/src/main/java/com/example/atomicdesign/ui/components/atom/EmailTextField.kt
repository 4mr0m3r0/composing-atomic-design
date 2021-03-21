package com.example.atomicdesign.ui.components.atom

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.R
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun EmailTextField(
    label: String = stringResource(id = R.string.email),
    emailText: String,
    onEmailChange: (String) -> Unit,
    imeAction: ImeAction = ImeAction.Next,
    onImeAction: () -> Unit = {}
) {
    OutlinedTextField(
        value = emailText,
        onValueChange = { onEmailChange(it) },
        label = {
            Text(text = label)
        },
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = imeAction),
        keyboardActions = KeyboardActions(
            onDone = {
                onImeAction()
            }
        )
    )
}

@Preview("EmailTextField light mode")
@Composable
fun PreviewEmailTextFieldLight() {
    AtomicDesignSampleTheme {
        Surface {
            val emailText = remember { mutableStateOf("") }
            EmailTextField(
                label = "Email",
                emailText = emailText.value,
                onEmailChange = { emailText.value = it }
            )
        }
    }
}

@Preview("EmailTextField dark mode")
@Composable
fun PreviewEmailTextFieldDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            val emailText = remember { mutableStateOf("") }
            EmailTextField(
                label = "Email",
                emailText = emailText.value,
                onEmailChange = { emailText.value = it }
            )
        }
    }
}