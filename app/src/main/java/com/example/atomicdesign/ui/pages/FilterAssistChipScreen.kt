package com.example.atomicdesign.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_components.chips.FilterAssistChip
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun FilterAssistChipScreen() {
    val filters = arrayListOf("Filter A", "Filter B", "Filter C",)
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = it.calculateBottomPadding()),
        ) {
            Row {
                filters.forEach { filter ->
                    var leadingIconVisible by remember { mutableStateOf(false) }
                    FilterAssistChip(
                        onClick = { leadingIconVisible = !leadingIconVisible },
                        text = filter,
                        modifier = Modifier.padding(
                            start = HorizontalPaddingSpace,
                            end = HorizontalPaddingSpace
                        ),
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null
                            )
                        },
                        leadingIconVisible = leadingIconVisible
                    )
                }
            }
        }
    }

}

private val HorizontalPaddingSpace = 4.dp

@Preview("Light")
@Composable
fun PreviewFilterAssistChipScreenLight() {
    DesignSystemTheme {
        Surface {
            FilterAssistChipScreen()
        }
    }
}

@Preview("Dark")
@Composable
fun PreviewFilterAssistChipScreenDark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            FilterAssistChipScreen()
        }
    }
}
