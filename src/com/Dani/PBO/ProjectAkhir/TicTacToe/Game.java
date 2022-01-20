package com.Dani.PBO.ProjectAkhir.TicTacToe;

import java.util.Scanner;

public class Game {
    PKotak loc = new PKotak();
    private Area Area = new Area();
    pemain Pemain = new pemain();
    Pemenangnya Pemenang = new  Pemenangnya();
    Scanner scanner = new Scanner(System.in);

    char[][] kotak = PKotak.kotak;
    Bukan Bukan = new Bukan();
    private int baris, kolom;
    public void mulaibermain() { //overload
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                kotak[i][j] = '_';
            }
        }
        loc.pkotak();
        while (Pemenang.pemenang()) {
            baris = scanner.nextInt();
            kolom = scanner.nextInt();
            if (baris > 3 || kolom > 3) {
                System.out.println("Salah, angka di luar kotak\nCoba lagi!");
            } else {
                if (Area.isFull(baris, kolom)) {
                    System.err.println("Sudah di isi");
                } else {
                    kotak[baris - 1][kolom - 1] = Pemain.arahnya();
                    loc.pkotak();
                    Pemain.pilihpemain();
                }
            }
        }
        Pemain.pilihpemain();
        System.out.println("\nPemenagnya: " + Pemain.arahnya());

    }
}
