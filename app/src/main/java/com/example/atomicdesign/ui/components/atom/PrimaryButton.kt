package com.example.atomicdesign.ui.components.atom

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.AtomicDesignSampleTheme
import java.util.*

@Composable
fun PrimaryButton(label: String, onClick: () -> Unit) {
    Button(
        onClick = onClick
    ) {
        Text(
            text = label.capitalize(Locale.getDefault()),
            color = MaterialTheme.colors.secondary
        )
    }
}

@Preview("PrimaryButton light mode")
@Composable
fun PreviewPrimaryButtonLight() {
    AtomicDesignSampleTheme {
        Surface {
            PrimaryButton(label = "Primary Button", onClick = { })
        }
    }
}

@Preview("PrimaryButton dark mode")
@Composable
fun PreviewPrimaryButtonDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            PrimaryButton(label = "Primary Button", onClick = { })
        }
    }
}