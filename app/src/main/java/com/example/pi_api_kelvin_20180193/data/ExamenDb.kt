package com.example.pi_api_kelvin_20180193.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pi_api_kelvin_20180193.model.Deudor


@Database(entities = [Deudor::class], version = 1)
abstract class ExamenDb: RoomDatabase() {
    abstract val deudorDao: DeudorDao
}
