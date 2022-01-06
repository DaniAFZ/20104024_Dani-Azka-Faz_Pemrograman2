package com.Dani.PBO.Modul8.Percobaan;

public class Test {
    public static void main(String[] args) {
        Parent kelas = new Child();
        System.out.println("Nilai x :\t" + kelas.x);
        kelas.info();
    }
}
