package com.example.perkebunan.repository

import com.example.perkebunan.model.pekerja

abstract class PekerjaRepository {
    abstract fun getAllPekerja(): List<pekerja.Pekerja>
    abstract fun getPekerjaById(id: Int): pekerja.Pekerja?
    abstract fun addPekerja(pekerja: pekerja.Pekerja)
    abstract fun updatePekerja(pekerja: pekerja.Pekerja)
    abstract fun deletePekerja(id: Int)
}