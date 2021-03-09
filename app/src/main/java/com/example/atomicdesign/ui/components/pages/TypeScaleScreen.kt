package com.example.atomicdesign.ui.components.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.components.atom.*
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

private val DEFAULT_PADDING = 10.dp

@Composable
fun TypeScaleScreen() {
    Column(
        modifier = Modifier
            .padding(DEFAULT_PADDING)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        HeadlineH1(text = "H1 Headline")
        Spacer(modifier = Modifier.size(4.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(4.dp))
        HeadlineH2(text = "H2 Headline")
        Spacer(modifier = Modifier.size(4.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(4.dp))
        HeadlineH3(text = "H3 Headline")
        Spacer(modifier = Modifier.size(4.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(4.dp))
        HeadlineH4(text = "H4 Headline")
        Spacer(modifier = Modifier.size(8.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(12.dp))
        HeadlineH5(text = "H5 Headline")
        Spacer(modifier = Modifier.size(12.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(12.dp))
        HeadlineH6(text = "H6 Headline")
        Spacer(modifier = Modifier.size(12.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(12.dp))
        Subtitle1(text = "Subtitle 1")
        Spacer(modifier = Modifier.size(14.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(14.dp))
        Subtitle2(text = "Subtitle 2")
        Spacer(modifier = Modifier.size(16.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(16.dp))
        Body1(text = "Body 1")
        Spacer(modifier = Modifier.size(16.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(16.dp))
        Body2(text = "Body 2")
        Spacer(modifier = Modifier.size(16.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.size(16.dp))
        Caption(text = "Caption")
        Spacer(modifier = Modifier.size(24.dp))
    }
}

@Preview("TypeScaleScreen light theme")
@Composable
fun PreviewTypeScaleScreenLight() {
    AtomicDesignSampleTheme {
        Surface {
            TypeScaleScreen()
        }
    }
}

@Preview("TypeScaleScreen dark theme")
@Composable
fun PreviewTypeScaleScreenDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            TypeScaleScreen()
        }
    }
}