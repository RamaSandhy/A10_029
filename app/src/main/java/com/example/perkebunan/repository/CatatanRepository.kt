package com.example.perkebunan.repository

class CatatanRepository {
    fun getAllCatatanPanen(): List<CatatanPanen>
    fun getCatatanPanenById(id: Int): CatatanPanen?
    fun addCatatanPanen(catatanPanen: CatatanPanen)
    fun updateCatatanPanen(catatanPanen: CatatanPanen)
    fun deleteCatatanPanen(id: Int)
}