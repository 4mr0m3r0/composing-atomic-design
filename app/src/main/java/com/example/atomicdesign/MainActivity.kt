package com.example.atomicdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atomicdesign.ui.AtomicDesignSampleTheme
import com.example.atomicdesign.ui.components.pages.ComponentsIndex
import com.example.atomicdesign.ui.components.templates.listoflements.Element
import com.example.atomicdesign.ui.components.templates.listoflements.ListOfElements

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AtomicDesignApp {
                DefaultContent()
            }
        }
    }
}

@Composable
fun AtomicDesignApp(content: @Composable () -> Unit) {
    AtomicDesignSampleTheme {
        Surface {
            content()
        }
    }
}

@Composable
fun DefaultContent() {
    Scaffold {
        ComponentsIndex()
    }
}

@Preview(showBackground = true, name = "MainActivity light mode")
@Composable
fun DefaultPreviewLight() {
    AtomicDesignSampleTheme {
        Surface {
            ComponentsIndex()
        }
    }
}

@Preview(name = "MainActivity dark mode")
@Composable
fun DefaultPreviewDark() {
    AtomicDesignSampleTheme(darkTheme = true) {
        Surface {
            ComponentsIndex()
        }
    }
}