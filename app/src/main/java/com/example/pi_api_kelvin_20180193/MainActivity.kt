package com.example.pi_api_kelvin_20180193

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pi_api_kelvin_20180193.model.Deudor
import com.example.pi_api_kelvin_20180193.ui.theme.PIAPIKelvin20180193Theme
import com.example.pi_api_kelvin_20180193.ui.theme.Deudor.ConsultaPrestamosScreen
import com.example.pi_api_kelvin_20180193.ui.theme.Deudor.RegistroPrestamosScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PIAPIKelvin20180193Theme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val navHostController = rememberNavController()

        NavHost(navController = navHostController, startDestination = "ConsultaNv") {
            composable(route = "ConsultaNv") {
                ConsultaPrestamosScreen(navHostController)
            }
            composable(route = "RegistroNv") {
                RegistroPrestamosScreen(navHostController)
            }
        }
    }
}

@Composable
fun RowDeudor(deudor: Deudor) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row() {
            Text(text = deudor.nombre, modifier = Modifier.width(width = 50.dp), style = MaterialTheme.typography.h6)
            Text(text = deudor.monto.toString(), style = MaterialTheme.typography.h6)
        }

        Text(text = deudor.concepto)


    }
}
