package com.Dani.PBO.ProjectAkhir.TicTacToe;

public class Bukan {
    char[][] kotak = PKotak.kotak; //polimorfisme
    public boolean luarkotak(int baris, int kolom) {
        if (baris > 3 || kolom > 3) {
            System.err.println("Ini bukan baris atau kolomnya");
            return true;
        }
        return false;
    }
}
