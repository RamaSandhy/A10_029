package com.example.perkebunan.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

class aktivitaspertanian {
    @Entity(
        tableName = "aktivitas_pertanian",
        foreignKeys = [
            ForeignKey(
                entity = tanaman.Tanaman::class,
                parentColumns = ["id_tanaman"],
                childColumns = ["id_tanaman"],
                onDelete = ForeignKey.CASCADE
            ),
            ForeignKey(
                entity = pekerja.Pekerja::class,
                parentColumns = ["id_pekerja"],
                childColumns = ["id_pekerja"],
                onDelete = ForeignKey.CASCADE
            )
        ]
    )
    data class AktivitasPertanian(
        @PrimaryKey(autoGenerate = true)
        val id_aktivitas: Int = 0,

        val id_tanaman: Int,
        val id_pekerja: Int,
        val tanggal_aktivitas: String,
        val deskripsi_aktivitas: String
    )
}