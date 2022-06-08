package com.example.pi_api_kelvin_20180193.ui.theme.entities

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun Consulta(){

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Consulta") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ){

    }
}