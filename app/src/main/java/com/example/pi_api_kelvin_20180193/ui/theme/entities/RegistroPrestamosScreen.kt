package com.example.pi_api_kelvin_20180193.ui.theme.entities

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun RegistroPrestamosScreen(navHostController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Registro") })
        },
    ) {
        Column(Modifier.padding(16.dp)) {
            OutlinedButton(onClick = { navHostController.navigate("ConsultaNv") }) {
                Text(text = "Guardar")
            }
        }

    }
}