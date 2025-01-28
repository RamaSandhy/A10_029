package com.example.perkebunan.repository

import com.example.perkebunan.model.tanaman

class TanamanRepository {
    fun getAllTanaman(): List<tanaman.Tanaman>
    fun getTanamanById(id: Int): tanaman.Tanaman?
    fun addTanaman(tanaman: tanaman.Tanaman)
    fun updateTanaman(tanaman: tanaman.Tanaman)
    fun deleteTanaman(id: Int)
}