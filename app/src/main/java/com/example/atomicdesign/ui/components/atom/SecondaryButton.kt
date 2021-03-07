package com.example.atomicdesign.ui.components.atom

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme
import java.util.*

@Composable
fun SecondaryButton(label: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        border = BorderStroke(1.dp, MaterialTheme.colors.primary),
        colors = buttonColors(backgroundColor = Color.White),
        modifier = modifier
    ) {
        Text(
            text = label.toUpperCase(Locale.getDefault()),
            color = MaterialTheme.colors.primary
        )
    }
}

@Preview("SecondaryButton light mode")
@Composable
fun SecondaryButtonButtonLight() {
    AtomicDesignSampleTheme {
        Surface {
            SecondaryButton(label = "Secondary Button", onClick = { })
        }
    }
}

@Preview("SecondaryButton dark mode")
@Composable
fun SecondaryButtonButtonDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            SecondaryButton(label = "Secondary Button", onClick = { })
        }
    }
}