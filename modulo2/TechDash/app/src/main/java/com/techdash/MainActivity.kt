package com.techdash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.techdash.ui.hardware.DashboardHardware
import com.techdash.ui.hardware.PantallaMenu
import com.techdash.ui.hardware.gps.PantallaGPS
import com.techdash.ui.hardware.sensores.PantallaSensores
import com.techdash.ui.theme.TechDashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TechDashTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "menu") {
                    composable("menu")      { PantallaMenu(navController) }
                    composable("gps")       { PantallaGPS() }
                    composable("sensores")  { PantallaSensores() }
                    composable("dashboard") { DashboardHardware() }
                }
            }
        }
    }
}