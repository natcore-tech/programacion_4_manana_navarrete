package com.techdash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.techdash.ui.permisos.PantallaConPermiso
import com.techdash.ui.theme.TechDashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TechDashTheme {
                PantallaConPermiso()
            }
        }
    }
}