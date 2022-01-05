package com.Dani.PBO.Modul4.Latihan;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord Utii = new StudentRecord();
        StudentRecord Ini = new StudentRecord();
        StudentRecord Nama  = new StudentRecord();

        Utii.setName("Utii");
        Ini.setName("Ini");
        Nama.setName("Nama");

        System.out.println(Utii.getName());
        System.out.println("Hitung\t: " +StudentRecord.getStudentCount());
    }
}
