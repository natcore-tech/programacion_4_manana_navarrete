package com.techdash

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.techdash.ui.multimedia.PantallaCamara
import com.techdash.ui.theme.TechDashTheme

class MainActivityCamera : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TechDashTheme {
                PantallaCamara(
                    onFotoTomada = { uri -> Log.d("TechDash", "Foto guardada: $uri") },
                    onCerrar     = {}
                )
            }
        }
    }
}