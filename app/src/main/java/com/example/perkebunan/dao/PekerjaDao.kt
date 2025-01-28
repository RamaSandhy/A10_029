package com.example.perkebunan.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface PekerjaDao {
    @Query("SELECT * FROM pekerja")
    fun getAllPekerja(): Flow<List<Pekerja>>
    
    @Query("SELECT * FROM pekerja WHERE id_pekerja = :id")
    suspend fun getPekerjaById(id: Int): Pekerja?

    @Insert
    suspend fun insertPekerja(pekerja: Pekerja)

    @Update
    suspend fun updatePekerja(pekerja: Pekerja)

    @Delete
    suspend fun deletePekerja(pekerja: Pekerja)
}