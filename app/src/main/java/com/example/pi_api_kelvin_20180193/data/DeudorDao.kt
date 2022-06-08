package com.example.pi_api_kelvin_20180193.data

import androidx.room.*
import com.example.pi_api_kelvin_20180193.model.Deudor
import kotlinx.coroutines.flow.Flow

@Dao
interface DeudorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(deudor: Deudor)

    @Delete
    suspend fun delete(deudor: Deudor)

    @Query("SELECT * FROM Deudor WHERE deudorId = :deudorId")
    fun buscar(deudorId: Int): Flow<Deudor>

    @Query("SELECT * FROM Deudor ORDER BY deudorId DESC")
    fun getList(): Flow<List<Deudor>>
}