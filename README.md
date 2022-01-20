# TUGAS BESAR PRAKTIKUM PEMROGRAMAN 2 SEMESTER 3

## DOSEN PENGAMPU : Arif Amrulloh, S.Kom., M.Kom
## ASISTEN PRAKTIKUM : Muslimin Dita H

## TEAM
- Alissyah Putri (20104013)
- Dani Azka Faz (20104024)
- Elan Bagaskoro (20104027)
- Idfian Azhar Hidayat (20104031)

# TicTacToe ❌⭕🔥
<hr>

# SINOPSIS GAME 🎬
❌⭕
Seorang player akan bermain TicTacToe bersama player lainnya. Dia memiliki kesempatan berfikir dan memilih meletakkan huruf X atau O untuk memenangkan permainan. Kunci utamanya untuk memenangkan permainan ada di huruf X dan O dengan cara menempatkan 3 simbol ( X / O) dalam satu deret.

Player X akan memulai permainan terlebih dahulu dan dilanjutkan dengan Player O.

Jika salah satu player berhasil meletakkan huruf X atau huruf O secara sejajar dalam satu deret baik itu secara horizontal, vertikal, atau diagonal sebagai contoh : 
( X X X), (O O O) maka player tersebut memenangkan permainan.

Jika simbol huruf X dan O tidak sejajar dalam satu deret maka permainan ini akan seri sebagai contoh : 
| O | X | O |
| :---         |     :---:      |          ---: |
| X   | O     | O    |
| X     | O     | X      |

Saat player X atau player O memenangkan permainan akan muncul 
"Pemenangnya : X / O" 

Dikarenakan salah satu player sudah memenangkan permainan atau permainan berakhir seri maka permainan akan berakhir.
🎊 🎉

# Materi Pemrograman OOP yang Relefan Dalam Membuat Game TicTacToe

## Struktur Dasar Dalam Game TicTacToe⭕❌⭕

## Class Utama
- Main.class
- Pemain.class
- Pemenang.class

## Mekanisme Game
- GamePlay
 - Klik pada tempat yang masih kosong
 - Game akan terus berlanjut sampai semua kotak terisi simbol X / O

## FLOWCHART
![image](https://user-images.githubusercontent.com/97183939/150293101-e328ef81-6943-41bf-bb77-7452eb9328a7.png)

## MATERI YANG RELEVAN DENGAN PENGGUNAAN CODE
1. OOP atau Pemrograman Berorientasi Objek OOP atau Pemrograman Berorientasi Objek merupakan pemrograman yang berorientasikan kepada objek, yang mana semua data dan fungsi dibungkus dalam class atau object. Dalam penggunaan OOP sendiri meliputi Deklarasi Class, Deklarasi Atribut, Deklarasi Method serta Mengakses Objek.
Penerapan Class dalam pemrograman kami yaitu pada bagian : 

```java
Class Main {...}
Class Area {...}
Class Bukan {...}
Class Game {...}
Class Pemenang {...}
Class PKotak {...}
```
Untuk penggunaan Enkapsulasi, seluruh class menggunakan akses modifire public agar dapat diakses oleh main dengan mudah.
```java
public class Pemenang {...}
````
Kemudian penggunakan modifire private digunakan dalam deklarasi variable pada Class Game, ini digunakan agar saat dalam pemanggilan dalam class lain tidak ada kesalahan pemanggilan.
```java
private int baris, kolom;
```
Kami juga menggunakan modifire protected dalam Class Area, penggunaan modifire protected dalam class Area difungsikan agar hanya class turunan Area yang dapat menggunakannya, seperti class Pemain.
```java
protected String name;
```

2. Dasar Pemrograman Berorientasi Objek

Dasar pada pemrograman berorientasi objek yaitu diantaranya terdapat :

- Keyword
Sebuah identifier yang telah dipesan untuk melakukan pendefinisian sebelumnya oleh java yang digunakan untuk tujuan tertentu.
- Tipe-Tipe Data Dasar
Dalam dasar pemrograman java terdapat 8 tipe dasar yaitu boolean, char, byte, short, int, long, float, dan double, contoh penerapan nya yaitu :
```java
int baris;
```
Diatas adalah contoh dari penerapan tipe data dasar yaitu integer dimana gunanya adalah untuk melakukan pendeklarasian data dengan bertipe data dasar integer yang hanya dapat menerima data angka.
-Variabel
Variabel merupakan sebuah wadah yang digunakan untuk penyimpanan data pada java, contoh penerapan nya yaitu :
```java
int kolom;
```
Diatas merupakan contoh penerapan variabel dalam java, dimana diatas terjadi pendeklarasian variabel code dengan bertipe data integer.
3. Mengelola Class
Pada java dalam pengelolaan class terdapat 2 bagian yaitu :

- Package
Package yaitu merupakan sebuah metode enkapsulasi yang digunakan untuk melakukan pengelompokan class, sub package dan interfaces, package ini digunakan selain untuk mealkukan pengelompokan juga digunakan untuk mencegah konflik penamaan terhadap file file, layaknya dalam folder didalam sebuah directory, contoh dari penerapan Package :
```java
package com.ProjectAkhir;
```
- Import
Import digunakan untuk melakukan pemanggilan sehingga, function - function dalam class tersebut dapat diakses biasanya digunakan untuk memanggil sebuah package beserta isinya dan juga dapat digunakan untuk memanggil interface, contoh penerapan dari import yaitu :
```java
import java.util.Scanner;
```
4. Inheritance
Inheritance atau Pewarisan merupakan sebuah konsep Object Oriented Programming, dimana sebuah class yang baru mewarisi atau memiliki metode - metode atau bagian - bagian dari class yang sebelumnya yang sudah ada, Konsep Pewarisan ini dalam penggunaannya menggunakan sistem hirarki atau sistem yang bertingkat dimana apabila submenu tersebut lebih spesifik maka akan semakin spesifik juga isi didalamnya itu juga berlaku dalam konsep pewarisan OOP apabila semakin spesifik subclassnya maka akan semakin sedikit pula bagian - bagian yang dapat diwarisi class tersebut kepada class berikutnya, contoh dari penerapan inheritance :
```java
public class Area {...}
```
```java
public class Pemain extends Area{ //interitance
    public char arah = 'X';
    public void pilihpemain() { //overload
        if (arah == 'X') {
            arah = 'O';
        } else {
            arah = 'X';
        }
    }
    public char arahnya() {
        return arah;
    }
}
```
Diatas merupakan contoh inheritance dimana class Area merupakan parent class dari class Pemain sedangkan class Pemain merupakan child class dari Area.

5. Overloading & Overriding

Pada java terdapat 2 metode yang dapat dilakukan untuk meringkas bagian pemrograman, 2 metode tersebut yaitu overloading dan overriding.

- Overloading
Overloading merupakan sebuah metode yang digunakan untuk memungkinkan banyak metode - metode yang memiliki perbedaan dalam parameter dan hasil return yang berbeda untuk memiliki nama yang sama, dikarenakan oleh itu penggunaan metode Overloading bermanfaat yaitu tidak perlu lagi membuat fungsi - fungsi yang memiliki perbedaan nama namun bertugas sama, syarat yang harus terpenuhi apabila ingin melakukan metode Overloading yaitu :
```java
    -  Nama metode harus sama
    -  Daftar Parameter harus berbeda
    -  Return type dapat sama namun juga boleh berbeda;
```
- Overriding
Overriding merupakan sebuah metode yang digunakan untuk mengimplementasikan sebuah fungsi spesifik di subclass dimana fungsi tersebut berada di superclass, syarat yang harus terpenuhi apabila ingin menggunakan metode Overriding yaitu :
```java
    - Nama metode harus sama
    - Daftar Parameter harus sama
    - Return type harus sama 
```
