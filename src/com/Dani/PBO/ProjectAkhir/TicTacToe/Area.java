package com.Dani.PBO.ProjectAkhir.TicTacToe;

public class Area {
    char[][] kotak = PKotak.kotak;
    public boolean isFull(int baris, int kolom) {
        return kotak[baris - 1][kolom - 1] == 'X' ||
                kotak[baris - 1][kolom - 1] == 'O';
    }
}
