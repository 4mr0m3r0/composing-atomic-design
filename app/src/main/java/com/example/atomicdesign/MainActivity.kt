package com.example.atomicdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.example.atomicdesign.ui.navigation.NavGraph
import com.example.ui_components.theme.DesignSystemTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignSystemTheme {
                Surface {
                    NavGraph()
                }
            }
        }
    }
}