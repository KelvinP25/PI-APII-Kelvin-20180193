package com.example.pi_api_kelvin_20180193.ui.theme.Deudor

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ConsultaPrestamosScreen(navHostController: NavHostController){

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Consulta") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { navHostController.navigate("RegistroNv") }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ){

    }
}