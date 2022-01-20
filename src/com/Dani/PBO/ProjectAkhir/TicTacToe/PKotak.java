package com.Dani.PBO.ProjectAkhir.TicTacToe;

public class PKotak {
    public static char[][] kotak = new char[3][3];
    public void pkotak() { //overload
        System.out.print("\nCara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.\n");

        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(kotak[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
}
