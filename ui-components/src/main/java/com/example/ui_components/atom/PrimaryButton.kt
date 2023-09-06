package com.example.ui_components.atom

import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import java.util.*

@Composable
fun PrimaryButton(label: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(
            text = label.uppercase(Locale.getDefault()),
            color = Color.White
        )
    }
}

@Preview("PrimaryButton light mode")
@Composable
fun PreviewPrimaryButtonLight() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            PrimaryButton(label = "Primary Button", onClick = { })
        }
    }
}

@Preview("PrimaryButton dark mode")
@Composable
fun PreviewPrimaryButtonDark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            PrimaryButton(label = "Primary Button", onClick = { })
        }
    }
}