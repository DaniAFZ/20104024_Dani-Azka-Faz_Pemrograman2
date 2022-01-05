# 20104024_Dani-Azka-Faz_Pemrograman2
## Pratikum Pemrograman 2

<hr>

## Modul 3 : PENGENALAN PEMROGRAMAN BERORIENTASI OBJEK

# Dasar Teori

* Pemrograman Berorientasi Objek
Merupakan pemrograman yang berorientasikan kepada objek yang mana semua data dan fungsi di bungkus dalam class atau object.
 
* Deklarasikan Class
Class merupakan sebuah wadah yang berisikan suatu pemodelan dari objek yang mendeskripsikan data atau sifat karakter dan fungsi dari objek -nya, dan dapat diartikan cetak biru _(blue print)_ untuk membuat suatu objek.
```Java
<modifier> class <nama_class> {
        [isi class]
        }
        Contoh : 
            public class Mobil{ }
```
* Deklarasi Atribut
Adalah suatu _Nilai Data_ yang terletak pada objek dan berasal dari _Class_.
 ```Java
<modifier> <tipe> <nama_atribut> ;
Contoh : 
      public String warna;
```
* Deklarasikan Method
Untuk mengakses suatu _objek_ atau anggota nya harus membuat intance dari _class_ terlebih dahulu.
```Java
 public class Mobil {
  public static void main(String args[]){ 
    Mobil m=new Mobil();
    m.warna=”hitam”;
    m.no_Plat=”KT 2837 UE”;
    m.info();
   }
}
```
<hr>

## Pratikum
Soal : 
1. Mengimpelementasikan UML Class diagram dalam program untuk class tabungan

| Tbungan | 
|-------|
|+ saldo : int|
|+ Tabungan ( intSaldo : int|
|+ getSaldo() : int|
|+ AmbilUang(Jumlah :int) : boolean|

Jawab : 
1. [Jawaban Soal 1](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul3/src/com/Dani/PBO/Modul3/Latihan/Tabungan.java)
Berdasarkan tabel UML diatas,dapat dibuat code program sebagain berikut : 
```Java
int saldo;
```
Merupakan deklarasi saldo ber tipe integer
```Java
public Tabungan(int saldo){
  this.saldo = saldo;
  }
```
Kemudian membuat method berdasarkan class untuk diakses sendiri sebagai base data,
```Java
public int getSaldo(){
  return saldo;
  }
```
Kemudian getSaldo sebagai keluaran saldo yang ada dalam program atau yang tersimpan,
```Java
public int simpanUang(int jumlah){
  return saldo = saldo + jumlah;
  }
```
Method simpang uang untuk input nilai dari user kedalam data saldo yang ada, dengan hasilnya nanti saldo + jumlah, jumlah ini merupakan inputan dari user,
```Java
public boolean ambilUang(int jumlah){
  if (saldo - jumlah < 0){
    return false;
  } else {
    saldo -= jumlah;
    return true;
  }
}
```
Kemudian method ambil uang, ini digunakan untuk keluaran uang dari saldo ketika uang diambil, yaitu dengan saldo - jumlah dengan jumlah berasal dari inputan oleh user.
<hr>

# Kesimpulan
Kesimpulan praktikum pemrograman pada modul 3 kali ini adalah mahasiswa dituntut agar mampu memahami cara penggunakan class, objek, dan method pada pemrograman dan bagaimana implementasinya jika digunakan dalam model oop, serta bagaimana masing masing program bekerja saat dijalankan.
