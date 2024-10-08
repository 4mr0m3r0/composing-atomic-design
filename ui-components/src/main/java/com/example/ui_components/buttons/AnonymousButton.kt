package com.example.ui_components.buttons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_components.R
import com.example.ui_components.theme.DesignSystemTheme

@Composable
fun AnonymousButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String
) {
    OutlinedButton(onClick = onClick, modifier = modifier, enabled = enabled) {
        Icon(painter = painterResource(id = R.drawable.incognito), contentDescription = null)
        Text(text = text, modifier = Modifier.padding(start = 8.dp))
    }
}

@Preview("Light")
@Composable
private fun Light() {
    DesignSystemTheme {
        Surface {
            AnonymousButton(onClick = { /*TODO*/ }, text = "Anonymous Button")
        }
    }
}

@Preview("Dark")
@Composable
private fun Dark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            AnonymousButton(onClick = { /*TODO*/ }, text = "Anonymous Button")
        }
    }
}