package com.example.ui_components.atom

import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.theme.AtomicDesignSampleTheme
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
    com.example.ui_components.theme.AtomicDesignSampleTheme {
        Surface {
            PrimaryButton(label = "Primary Button", onClick = { })
        }
    }
}

@Preview("PrimaryButton dark mode")
@Composable
fun PreviewPrimaryButtonDark() {
    com.example.ui_components.theme.AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            PrimaryButton(label = "Primary Button", onClick = { })
        }
    }
}