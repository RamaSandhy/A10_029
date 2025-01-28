package com.example.perkebunan.model

import androidx.room.PrimaryKey

class pekerja {
    data class Pekerja(
        @PrimaryKey(autoGenerate = true)
        val id_pekerja: Int = 0, // ID pekerja, auto-generate
        val nama_pekerja: String, // Nama lengkap pekerja
        val jabatan: String, // Jabatan pekerja
        val kontak_pekerja: String // Informasi kontak pekerja
    )
}