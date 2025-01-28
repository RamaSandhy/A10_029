package com.example.perkebunan.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface CatatanPanenDao {
    @Query("SELECT * FROM catatan_panen")
    fun getAllCatatanPanen(): Flow<List<CatatanPanen>>

    @Query("SELECT * FROM catatan_panen WHERE id_panen = :id")
    suspend fun getCatatanPanenById(id: Int): CatatanPanen?

    @Query("SELECT * FROM catatan_panen WHERE id_tanaman = :idTanaman")
    fun getCatatanPanenByTanamanId(idTanaman: Int): Flow<List<CatatanPanen>>

    @Insert
    suspend fun insertCatatanPanen(catatanPanen: CatatanPanen)

    @Update
    suspend fun updateCatatanPanen(catatanPanen: CatatanPanen)

    @Delete
    suspend fun deleteCatatanPanen(catatanPanen: CatatanPanen)
}