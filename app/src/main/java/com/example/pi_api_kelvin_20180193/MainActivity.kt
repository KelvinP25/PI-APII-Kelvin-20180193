package com.example.pi_api_kelvin_20180193

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pi_api_kelvin_20180193.ui.theme.PIAPIKelvin20180193Theme
import com.example.pi_api_kelvin_20180193.ui.theme.entities.Consulta
import com.example.pi_api_kelvin_20180193.ui.theme.entities.Registro

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

@Preview(showBackground = true)
@Composable
fun MyApp(){


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val navHostController = rememberNavController()
        NavHost(navController = navHostController, startDestination = "Consulta"){
            composable(route = "ConsultaNv") {
                Consulta(navHostController)
            }
            composable(route = "RegistroNv") {
                Registro(navHostController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PIAPIKelvin20180193Theme {
        MyApp()
    }
}