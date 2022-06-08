package com.example.pi_api_kelvin_20180193.ui.theme.Deudor

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pi_api_kelvin_20180193.data.repository.DeudorRepository
import com.example.pi_api_kelvin_20180193.model.Deudor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DeudorviewModel @Inject constructor(
    val deudorRepository: DeudorRepository
) : ViewModel() {
    var nombre by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf(0.00)

    var deudor = deudorRepository.getList()

    fun Guardar() {
        viewModelScope.launch {
            deudorRepository.insert(
                Deudor(
                    nombre = nombre,
                    concepto = concepto,
                    monto = monto
                )
            )
        }
    }
}
