package com.example.perkebunan.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface AktivitasPertanianDao {
    @Query("SELECT * FROM aktivitas_pertanian")
    fun getAllAktivitas(): Flow<List<AktivitasPertanian>>

    @Query("SELECT * FROM aktivitas_pertanian WHERE id_aktivitas = :id")
    suspend fun getAktivitasById(id: Int): AktivitasPertanian?

    @Query("SELECT * FROM aktivitas_pertanian WHERE id_tanaman = :idTanaman")
    fun getAktivitasByTanamanId(idTanaman: Int): Flow<List<AktivitasPertanian>>

    @Insert
    suspend fun insertAktivitas(aktivitas: AktivitasPertanian)

    @Update
    suspend fun updateAktivitas(aktivitas: AktivitasPertanian)

    @Delete
    suspend fun deleteAktivitas(aktivitas: AktivitasPertanian)
}