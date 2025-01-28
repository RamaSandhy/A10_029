package com.example.perkebunan.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.perkebunan.model.aktivitaspertanian
import kotlinx.coroutines.flow.Flow

interface AktivitasPertanianDao {
    @Query("SELECT * FROM aktivitas_pertanian")
    fun getAllAktivitas(): Flow<List<aktivitaspertanian.AktivitasPertanian>>

    @Query("SELECT * FROM aktivitas_pertanian WHERE id_aktivitas = :id")
    suspend fun getAktivitasById(id: Int): aktivitaspertanian.AktivitasPertanian?

    @Query("SELECT * FROM aktivitas_pertanian WHERE id_tanaman = :idTanaman")
    fun getAktivitasByTanamanId(idTanaman: Int): Flow<List<aktivitaspertanian.AktivitasPertanian>>

    @Insert
    suspend fun insertAktivitas(aktivitas: aktivitaspertanian.AktivitasPertanian)

    @Update
    suspend fun updateAktivitas(aktivitas: aktivitaspertanian.AktivitasPertanian)

    @Delete
    suspend fun deleteAktivitas(aktivitas: aktivitaspertanian.AktivitasPertanian)
}