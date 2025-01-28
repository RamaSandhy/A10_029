package com.example.perkebunan.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.perkebunan.model.tanaman
import kotlinx.coroutines.flow.Flow

interface TanamanDao {
    @Query("SELECT * FROM tanaman")
    fun getAllTanaman(): Flow<List<tanaman.Tanaman>>

    @Insert
    suspend fun insertTanaman(tanaman: tanaman.Tanaman)

    @Update
    suspend fun updateTanaman(tanaman: tanaman.Tanaman)

    @Delete
    suspend fun deleteTanaman(tanaman: tanaman.Tanaman)
}