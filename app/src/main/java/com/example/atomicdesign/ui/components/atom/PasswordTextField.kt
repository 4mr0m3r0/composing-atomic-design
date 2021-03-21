package com.example.atomicdesign.ui.components.atom

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.R
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

@Composable
fun PasswordTextField(
    label: String = stringResource(id = R.string.password),
    imeAction: ImeAction = ImeAction.Next,
    onImeAction: () -> Unit = {}
) {
    OutlinedTextField(
        value = "",
        onValueChange = { /*TODO*/ },
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

@Preview("PasswordTextField light mode")
@Composable
fun PreviewPasswordTextFieldLight() {
    AtomicDesignSampleTheme {
        Surface {
            PasswordTextField(label = "Password")
        }
    }
}

@Preview("PasswordTextField dark mode")
@Composable
fun PreviewPasswordTextFieldDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            PasswordTextField(label = "Password")
        }
    }
}