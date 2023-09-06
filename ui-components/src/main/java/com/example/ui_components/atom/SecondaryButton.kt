package com.example.ui_components.atom

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.*

@Composable
fun SecondaryButton(label: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = onClick,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
        modifier = modifier
    ) {
        Text(
            text = label.uppercase(Locale.getDefault()),
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Preview("SecondaryButton light mode")
@Composable
fun SecondaryButtonButtonLight() {
    com.example.ui_components.theme.DesignSystemTheme {
        Surface {
            SecondaryButton(label = "Secondary Button", onClick = { })
        }
    }
}

@Preview("SecondaryButton dark mode")
@Composable
fun SecondaryButtonButtonDark() {
    com.example.ui_components.theme.DesignSystemTheme(darkTheme = true) {
        Surface {
            SecondaryButton(label = "Secondary Button", onClick = { })
        }
    }
}