package com.example.perkebunan.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.perkebunan.model.pekerja
import kotlinx.coroutines.flow.Flow

interface PekerjaDao {
    @Query("SELECT * FROM pekerja")
    fun getAllPekerja(): Flow<List<pekerja.Pekerja>>

    @Query("SELECT * FROM pekerja WHERE id_pekerja = :id")
    suspend fun getPekerjaById(id: Int): pekerja.Pekerja?

    @Insert
    suspend fun insertPekerja(pekerja: pekerja.Pekerja)

    @Update
    suspend fun updatePekerja(pekerja: pekerja.Pekerja)

    @Delete
    suspend fun deletePekerja(pekerja: pekerja.Pekerja)
}