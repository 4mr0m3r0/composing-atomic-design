package com.example.ui_components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

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