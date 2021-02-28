package com.example.atomicdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.atomicdesign.ui.AtomicDesignSampleTheme
import com.example.atomicdesign.ui.components.pages.ComponentsIndex

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