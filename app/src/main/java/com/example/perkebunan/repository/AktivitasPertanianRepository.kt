package com.example.perkebunan.repository

abstract class AktivitasPertanianRepository {
    abstract fun getAllAktivitas(): List<Aktivitas>
    abstract fun getAktivitasById(id: Int): Aktivitas?
    abstract fun addAktivitas(aktivitas: Aktivitas)
    abstract fun updateAktivitas(aktivitas: Aktivitas)
    abstract fun deleteAktivitas(id: Int)
}