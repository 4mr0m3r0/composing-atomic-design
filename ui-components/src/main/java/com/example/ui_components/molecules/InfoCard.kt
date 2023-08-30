package com.example.ui_components.molecules

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

@Composable
fun InfoCard(image: Painter) {
    Card(
        shape = MaterialTheme.shapes.medium
    ) {
        Column {
            Image(
                painter = image,
                contentDescription = null
            )
        }
    }
}