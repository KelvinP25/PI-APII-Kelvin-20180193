package com.example.pi_api_kelvin_20180193.ui.theme.Deudor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroPrestamosScreen(
    navHostController: NavHostController,
    viewModel: DeudorviewModel = hiltViewModel()
) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Registo Prestamos") })
        },
    ) {
        Column(Modifier.padding(16.dp)) {
            OutlinedTextField(
                value = viewModel.nombre,
                onValueChange = { viewModel.nombre = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Nombre") },
                leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = null) }
            )
            OutlinedTextField(
                value = viewModel.concepto,
                onValueChange = { viewModel.concepto = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Concepto") },
                leadingIcon = { Icon(imageVector = Icons.Filled.CardMembership, contentDescription = null) }
            )
            OutlinedTextField(
                value = viewModel.monto.toString(),
                onValueChange = { viewModel.monto = it.toDouble() },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Monto") },
                leadingIcon = { Icon(imageVector = Icons.Filled.AttachMoney, contentDescription = null) }
            )
            OutlinedButton(onClick = {
                viewModel.Guardar()
                navHostController.navigate("ConsultaNv")
            }, modifier = Modifier.padding(16.dp)) {
                Text(text = "Guardar")
            }
        }

    }
}