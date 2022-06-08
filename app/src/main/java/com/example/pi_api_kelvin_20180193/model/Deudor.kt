package com.example.pi_api_kelvin_20180193.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Deudor")
data class Deudor(
    @PrimaryKey(autoGenerate = true)
    val deudorId: Int = 0,
    val nombre: String,
    val concepto: String,
    val monto: Double,
)

