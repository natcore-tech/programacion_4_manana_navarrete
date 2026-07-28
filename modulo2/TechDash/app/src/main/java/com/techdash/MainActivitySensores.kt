package com.techdash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.techdash.ui.hardware.sensores.PantallaSensores
import com.techdash.ui.theme.TechDashTheme

class MainActivitySensores : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TechDashTheme {
                PantallaSensores()
            }
        }
    }
}