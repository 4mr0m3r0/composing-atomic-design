package com.example.atomicdesign.ui.components.pages

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.R

@Composable
fun ComponentsIndex(modifier: Modifier = Modifier) {
    ScrollableColumn {
        Text(text = stringResource(id = R.string.type_scale))
    }
}