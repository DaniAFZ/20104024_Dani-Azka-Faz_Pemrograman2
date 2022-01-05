# 20104024_Dani-Azka-Faz_Pemrograman2
## Pratikum Pemrograman 2
<hr>

# MODUL 5 : MENGELOLA CLASS
## Dasar Teori
* Package
merupakan sebuah mekanisme enkapsulasi untuk mengelompokan class, sub package dan interfaces. Package juga digunakan untuk mencegah konflik penamaan. Secara mudahnya jika diibaratkan package itu sebagai folder dalam direktori file, dan file sebagai classnya, serta isi filenya adalah program atau method-method.
```Java
package nama-paket;
<identifier> class <nama_class sama dengan package>
Contoh : package Utama;
public class Utama{ }
```

Dan untuk ``` memanggil package ``` dapat menggunakan _format import_
```Java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```
* Import class
Kata kunci import digunakan untuk mengimport atau memasukan atau mengakses dari package, class, atau interfaces.

Sebagai contohnya import class Scanner
```Java
package ***;

import java.util.Scanner;
import java.util.*;

class namaClass {
}
```
Sedangkan untuk mengimpor class tertentu
```Java
import <nama_package>.<nama_class>;
Contoh : import matematik.bilangan;
```
* Kata kunci this
Keyword _This_ merujuk pada object saat ini dalam method atau constructor. Penggunaan kata kunci _This_ yang paling umum adalah untuk menghilangkan kebingungan antara atribut kelas dan parameter dengan nama yang sama (karena atribut kelas dibayangi oleh metode atau parameter konstruktor).

Penulisan kata kunci this :

```Java
this.data_member        // merujuk pada data member
this.function_member()  // merujuk pada function member
this()                  // merujuk pada konstruktor
```
### Praktikum
Soal :

1. Mengimplementasikan UML class diagram dalam program untuk package perbankan
 
 Jawaban :
1. [Jawaban Soal](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/tree/Modul5/src/com/Dani/PBO/Modul5/Latihan)
* [Pada package perbankan](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/tree/Modul5/src/com/Dani/PBO/Modul5/Latihan/Perbankan)
Pada package perbankan di isi 2 class yaitu class Nasabah dan class Tabungan sebagi pemisah dengan class main agar terkoordinasi dengan baik. Pada package ini dapat di identifikasi dengan melihat dari urutan file di atas :

```Java
package Modul5.latihan.perbankan;
````
* [class Nasabah](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul5/src/com/Dani/PBO/Modul5/Latihan/Perbankan/Nasabah.java)
Pada class Nasabah digunaakan untuk menyimpan data identitas dari Nasabah suatu bank. Pada class ini diawali dengan deklarasi atribut
```Java
private String namaAwal;
private String namaAkhir;
private Tabungan tabungan;
```
Pada method Nasabah menggunakan keyword ``` this ```
```Java
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
```
``` this.namaAwal ``` pada method itu merujuk pada atribut namaAwal yang terletak pada atribut namaAwal diatas. Begitu juga dengan ``` this.namaAkhir ```. Jika dijelaskan sebagai berikut inputan yang menggunakan method Nasabah(namaAwal, namaAkhir) akan disimpan pada atribut namaAwal dan namaAkhir pada class Nasabah.

Begitu juga dengan method setTabungan.
```Java
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
```
* [class Tabungan](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul5/src/com/Dani/PBO/Modul5/Latihan/Perbankan/Tabungan.java) 
Pada class Tabungan dibunakan utnuk menyimpan data nominal uang yang dimasukan ataupun data uang yang akan diambil. Pada class ini diawali dengan deklarasi atribut saldo sebagai tempat menyimpan data uang, jumlah sebagai nominal yang diimputkan dari user.
```Java
private int saldo;
private int jumlah;
```
Kemudian pada method Tabungan(int saldo) menggunakan kata kunci this yang merujuk pada atribut saldo
```Java
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
```
Di class TesLatihan sebagai main Pada class TesKatihan terletak pada tempat yang sama dengan package perbankan, di package latihan
```Java
package Modul5.latihan;
```
Pada class TesLatihan memanggil class Nasabah dan Tabungan menggunakan perintah
import untuk memanggil class lain
```Java
import Modul5.latihan.perbankan.Nasabah;
import Modul5.latihan.perbankan.Tabungan;
```
Pada class ini berisikan main dari user yang akan meletakan atau menggambil uang yang ada pada Tabungan.

# Kesimpulan
Kesimpulan praktikum pemrograman pada modul 5 kali ini kami belajar menggunakan import dan mengambil atau mengakses class dari package lain. Serta memahami keyword this dan bagaimana penggunakan serta makananya pada code program. Serta sebagai latihan diberikan suatu permasalahan untuk menilai sejauhmana pemahaman mengenai materi yang sudah disampaikan dan sebagai latihan untuk memecahkan suatu permasalahan.

