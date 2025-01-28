package com.example.perkebunan.model

import androidx.room.PrimaryKey
import java.util.Date

class catatanpanen {
    data class CatatanPanen(
        @PrimaryKey(autoGenerate = true)
        val id_panen: Int = 0, // ID unik untuk setiap catatan panen
        val id_tanaman: Int, // ID tanaman yang dipanen
        val tanggal_panen: Date, // Tanggal panen dilakukan
        val jumlah_panen: Double, // Jumlah hasil panen (misal: kilogram atau buah)
        val keterangan: String // Keterangan tambahan tentang kondisi panen atau masalah yang ditemui
    )
}