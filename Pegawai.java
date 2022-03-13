package com.company;

public class Pegawai {
    private String nip;
    private String nama;
    private String divisi;

    public Pegawai (String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    @Override
    public String toString() {
        return "Pegawai{nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", divisi='" + divisi + '\'' +"}"
                ;
    }
}