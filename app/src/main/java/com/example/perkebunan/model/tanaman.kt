package com.example.perkebunan.model

import androidx.room.PrimaryKey

class tanaman {
    data class Tanaman(
        @PrimaryKey(autoGenerate = true)
        val id_tanaman: Int = 0,
        val nama_tanaman: String,
        val periode_tanam: String,
        val deskripsi_tanaman: String
    )
}