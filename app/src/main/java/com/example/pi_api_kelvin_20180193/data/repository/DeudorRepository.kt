package com.example.pi_api_kelvin_20180193.data.repository

import com.example.pi_api_kelvin_20180193.data.DeudorDao
import com.example.pi_api_kelvin_20180193.model.Deudor
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DeudorRepository @Inject constructor(
    val DeudorDao: DeudorDao
) {
    suspend fun insert(deudor: Deudor){
        DeudorDao.insert(deudor)
    }
    suspend fun delete(deudor: Deudor){
        DeudorDao.delete(deudor)
    }

    fun buscar(deudorId: Int): Flow<Deudor>{
        return DeudorDao.buscar(deudorId)
    }

    fun getList(): Flow<List<Deudor>>{
        return DeudorDao.getList()
    }
}