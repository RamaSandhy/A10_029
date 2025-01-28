package com.example.perkebunan.repository

import com.example.perkebunan.model.catatanpanen

abstract class CatatanRepository {
    abstract fun getAllCatatanPanen(): List<catatanpanen.CatatanPanen>
    abstract fun getCatatanPanenById(id: Int): catatanpanen.CatatanPanen?
    abstract fun addCatatanPanen(catatanPanen: catatanpanen.CatatanPanen)
    abstract fun updateCatatanPanen(catatanPanen: catatanpanen.CatatanPanen)
    abstract fun deleteCatatanPanen(id: Int)
}