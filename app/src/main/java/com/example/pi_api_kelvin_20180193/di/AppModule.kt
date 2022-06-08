package com.example.pi_api_kelvin_20180193.di

import android.content.Context
import androidx.room.Room
import com.example.pi_api_kelvin_20180193.data.DeudorDao
import com.example.pi_api_kelvin_20180193.data.ExamenDb
import com.example.pi_api_kelvin_20180193.data.repository.DeudorRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesExamenDb(@ApplicationContext context: Context): ExamenDb {
        return Room.databaseBuilder(
            context,
            ExamenDb::class.java,
            "ExmanenDb"
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideDeudorDao(registroDeudorComposeDb: ExamenDb): DeudorDao = registroDeudorComposeDb.deudorDao

    @Provides
    fun provideDeudorRepository(deudorDao: DeudorDao): DeudorRepository = DeudorRepository(deudorDao)

}