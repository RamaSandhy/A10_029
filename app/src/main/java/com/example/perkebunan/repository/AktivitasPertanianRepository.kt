package com.example.perkebunan.repository

abstract class AktivitasPertanianRepository {
    abstract fun getAllAktivitas(): List<Aktivitas>
    fun getAktivitasById(id: Int): Aktivitas?
    fun addAktivitas(aktivitas: Aktivitas)
    fun updateAktivitas(aktivitas: Aktivitas)
    fun deleteAktivitas(id: Int)
}