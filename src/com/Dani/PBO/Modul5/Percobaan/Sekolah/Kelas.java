package com.Dani.PBO.Modul5.Percobaan.Sekolah;

import com.Dani.PBO.Modul5.Percobaan.Mahasiswa;

public class Kelas {
    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama){
        this.kodeKelas = kode;
        this.namaKelas = nama;
    }

    public void setMhs(Mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}
