package com.example.perkebunan.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface TanamanDao {
    @Query("SELECT * FROM tanaman")
    fun getAllTanaman(): Flow<List<Tanaman>>

    @Insert
    suspend fun insertTanaman(tanaman: Tanaman)

    @Update
    suspend fun updateTanaman(tanaman: Tanaman)

    @Delete
    suspend fun deleteTanaman(tanaman: Tanaman)
}