package com.example.pi_api_kelvin_20180193.ui.theme.Deudor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.pi_api_kelvin_20180193.RowDeudor
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun ConsultaPrestamosScreen(
    navHostController: NavHostController,
    viewModel: DeudorviewModel = hiltViewModel()
) {
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
    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)) {

            val lista = viewModel.deudor.collectAsState(initial = emptyList())
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(lista.value) { deudor ->
                   RowDeudor(deudor = deudor)
                }
            }

        }
    }
}