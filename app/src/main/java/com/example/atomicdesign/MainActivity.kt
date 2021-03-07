package com.example.atomicdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Surface
import com.example.atomicdesign.ui.navigation.NavGraph
import com.example.atomicdesign.ui.theme.AtomicDesignSampleTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AtomicDesignSampleTheme {
                Surface {
                    NavGraph()
                }
            }
        }
    }
}