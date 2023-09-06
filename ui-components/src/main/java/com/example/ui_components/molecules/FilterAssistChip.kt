package com.example.ui_components.molecules

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_components.atom.Body1
import com.example.ui_components.theme.DesignSystemTheme
import com.example.ui_components.theme.Seed

@Composable
fun FilterAssistChip(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    leadingIconVisible: Boolean = false,
    icon: @Composable() AnimatedVisibilityScope.() -> Unit
) {
    AssistChip(
        onClick = onClick,
        label = { Body1(text = text) },
        modifier = modifier.animateContentSize(),
        leadingIcon = {
            AnimatedVisibility(
                visible = leadingIconVisible,
                enter = expandHorizontally(expandFrom = Alignment.Start) + fadeIn(),
                exit = shrinkHorizontally(shrinkTowards = Alignment.Start) + fadeOut(),
                content = icon
            )
        },
        colors = if (leadingIconVisible) {
            AssistChipDefaults.assistChipColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
            )
        } else {
            AssistChipDefaults.assistChipColors(
                containerColor = Color.Transparent
            )
        },
        border = if (leadingIconVisible) {
            AssistChipDefaults.assistChipBorder(borderColor = Seed)
        } else {
            AssistChipDefaults.assistChipBorder()
        }
    )
}

@Preview("Light")
@Composable
internal fun FilterAssistChipLight() {
    val leadingIconVisible = remember { mutableStateOf(false) }
    DesignSystemTheme {
        Surface {
            FilterAssistChip(
                onClick = { leadingIconVisible.value = !leadingIconVisible.value },
                text = "Assist Chip",
                icon = {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null
                    )
                },
                leadingIconVisible = leadingIconVisible.value
            )
        }
    }
}

@Preview("Dark")
@Composable
internal fun FilterAssistChipDark() {
    val leadingIconVisible = remember { mutableStateOf(false) }
    DesignSystemTheme(darkTheme = true) {
        Surface {
            FilterAssistChip(
                onClick = { leadingIconVisible.value = !leadingIconVisible.value },
                text = "Assist Chip",
                icon = {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null
                    )
                },
                leadingIconVisible = leadingIconVisible.value
            )
        }
    }
}