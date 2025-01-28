package com.example.perkebunan.repository

abstract class CatatanRepository {
    abstract fun getAllCatatanPanen(): List<CatatanPanen>
    abstract fun getCatatanPanenById(id: Int): CatatanPanen?
    abstract fun addCatatanPanen(catatanPanen: CatatanPanen)
    abstract fun updateCatatanPanen(catatanPanen: CatatanPanen)
    abstract fun deleteCatatanPanen(id: Int)
}