package com.example.perkebunan.repository

import com.example.perkebunan.model.tanaman

abstract class TanamanRepository {
    abstract fun getAllTanaman(): List<tanaman.Tanaman>
    abstract fun getTanamanById(id: Int): tanaman.Tanaman?
    abstract fun addTanaman(tanaman: tanaman.Tanaman)
    abstract fun updateTanaman(tanaman: tanaman.Tanaman)
    abstract fun deleteTanaman(id: Int)
}