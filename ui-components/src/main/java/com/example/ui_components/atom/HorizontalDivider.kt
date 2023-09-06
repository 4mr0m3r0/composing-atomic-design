package com.example.ui_components.atom

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDivider() {
    Divider(
        color = Color.LightGray,
        modifier = Modifier.height(0.5.dp)
    )
}