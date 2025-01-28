package com.example.perkebunan.repository

import com.example.perkebunan.model.pekerja

abstract class PekerjaRepository {
    abstract fun getAllPekerja(): List<pekerja.Pekerja>
    fun getPekerjaById(id: Int): pekerja.Pekerja?
    fun addPekerja(pekerja: pekerja.Pekerja)
    fun updatePekerja(pekerja: pekerja.Pekerja)
    fun deletePekerja(id: Int)
}