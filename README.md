# 20104024_Dani-Azka-Faz_Pemrograman2
## Praktikum Pemrograman 2
<hr>

# Modul 2 : DASAR PEMOGRAMAN JAVA

## DASAR TEORI
* Keyword dalam Java
 merupakan `kata kunci dalam Java` / **`Identifier`** yang memiliki fungsi masing masing pada code program dan keyword tidak dapat digunakan dalam penamaan variable.

* Tipe Dasar
**JAVA** memiliki **8** tipe data, tipe Integer Number / Numerik / Angka yaitu Bilangan Bulat _(byte, short, int, long_), Bilangan Besimal (_float, double_), Karakter (_char_), Boolean (_boolean_).

* Variabel
Variabel merupakan `penanda identitas` yang digunakan sebagai tempat untuk menampung suatu nilai.

* Casting dan Promotion
Casting dan Promotion merupakan suatu proses `perubahan jenis type data` pada suatu variabel di dalam JAVA.


## Praktikum
Soal : 
1. BigInteger
2. Anak Ayam
3. A+B+C


Jawaban : 
1. [Jawaban Soal 1](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul2/src/com/Dani/PBO/Modul2/Latihan/BigInteger.java)
```Java
long p = 2147483648;
```
Syntax diatas akan menampilkan error :

```Java
C:\Users\ACER\OneDrive\PERKULIAHAN\SEMESTER 3\Pratikum Pemograman 2\20104024_Dani-Azka-Faz_Pemrograman2\src\com\Dani\PBO\Modul2\Latihan\BigInteger.java:5: error: integer number to large:2147483648
```
Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ? Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca tipe data yang kita maksud adalah tipe data long.

Contoh : 
```java
long p = 2147483648L;
```
2. [Jawaban Soal 2](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul2/src/com/Dani/PBO/Modul2/Latihan/AnakAyam.java)
```
Anak ayam turun	 10
	Mati 1 tinggal 9
Anak ayam turun	 9
	Mati 1 tinggal 8
Anak ayam turun	 8
	Mati 1 tinggal 7
Anak ayam turun	 7
	Mati 1 tinggal 6
Anak ayam turun	 6
	Mati 1 tinggal 5
Anak ayam turun	 5
	Mati 1 tinggal 4
Anak ayam turun	 4
	Mati 1 tinggal 3
Anak ayam turun	 3
	Mati 1 tinggal 2
Anak ayam turun	 2
	Mati 1 tinggal 1
Anak ayam turun	 1
Mati 1 tinggal induknya
```
Dengan menggunakan perulangan while if pada code untuk mengulagi angka yang menurun dan teks yang ada.

3. [Jawaban Soal 3](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul2/src/com/Dani/PBO/Modul2/Latihan/Abc.java)
Pada saat code dijalankan, user akan diminta untuk memasukan inputan berapa kali program akan dijalankan atau jumlah testcase yang akan dijalankan, misalnya :

`Masukan Jumlah Testcase : 2`

Kemudian sistem akan memproses dan menampilkan list huruf A, B, C untuk meminta masukan, dan akan berganti ke urutan ke 2 atau sesuai test case yang diminta, seperti ini :
```
Masukan A1 : 3
Masukin B1 : 4
Masukan C1 : 5
Masukan A2 : -3
Masukin B2 : -4
Masukan C2 : -5
```

kemudian sistem akan mengeluarkan hasilnya sebagai berikut : 
```
A1 + B1 - C1 = 2
A2 + B2 - C2 = -2
```
Ini bisa dilakukan karena dalam program terdapat perulangan for untuk mengatur perulangan dengan for i = 0, maka nantinya akan ditambahkan 1 atau sebanyak sesuai dari inputan awal daru user

```
for (int i = 0; i < t; i++){
  System.out.print("Masukan A" + (i + 1) + " : ");
  a[i] = in.nextInt();
  System.out.print("Masukin B" + (i + 1) + " : ");
  b[i] = in.nextInt();
  System.out.print("Masukan C" + (i + 1) + " : ");
  c[i] = in.nextInt();
 }
```

<hr>

## Kesimpulan
Pada modul ini siswa akan diingatkan kembali tentang materi awal, yang diharapkan dapat mempermudah dalam mengingat dan dapat menggunakannya dengan baik pada materi selanjutnya. Dan memahami pengetahuan dasar Java dan penggunaan tata bahasa di Java



