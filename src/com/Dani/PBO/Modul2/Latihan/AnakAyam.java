package com.Dani.PBO.Modul2.Latihan;

public class AnakAyam {
    public static void main(String[] args) {
        int anak = 10;

        while(anak > 0){
            System.out.println("Anak ayam turun\t " + anak);
            anak --;
            if (anak != 0) {
                System.out.println("\tMati 1 tinggal "+ anak);
            } else {
                System.out.println("Mati 1 tinggal induknya");
            }
        }
    }
}
