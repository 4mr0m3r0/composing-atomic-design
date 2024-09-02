package com.example.ui_components.buttons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
fun OAuthGoogleButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground
        )
    ) {
        Image(
            painter = painterResource(id = R.drawable.oauthg),
            contentDescription = null,
            modifier = Modifier.size(18.dp)
        )
        Text(text = text, modifier = Modifier.padding(start = 8.dp))
    }
}

@Preview("Light")
@Composable
private fun Light() {
    DesignSystemTheme {
        Surface {
            OAuthGoogleButton(onClick = { /*TODO*/ }, text = "OAuth Google Button")
        }
    }
}

@Preview("Dark")
@Composable
private fun Dark() {
    DesignSystemTheme(darkTheme = true) {
        Surface {
            OAuthGoogleButton(onClick = { /*TODO*/ }, text = "OAuth Google Button")
        }
    }
}