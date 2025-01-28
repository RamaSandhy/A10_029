package com.example.perkebunan.repository

import com.example.perkebunan.model.aktivitaspertanian

abstract class AktivitasPertanianRepository {
    abstract fun getAllAktivitas(): List<aktivitaspertanian.AktivitasPertanian>
    abstract fun getAktivitasById(id: Int): aktivitaspertanian.AktivitasPertanian?
    abstract fun addAktivitas(aktivitas: aktivitaspertanian.AktivitasPertanian)
    abstract fun updateAktivitas(aktivitas: aktivitaspertanian.AktivitasPertanian)
    abstract fun deleteAktivitas(id: Int)
}