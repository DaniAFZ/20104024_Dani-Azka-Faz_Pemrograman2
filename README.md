# 20104024_Dani-Azka-Faz_Pemrograman2
## Pratikum Pemrograman 2

<hr>

# Modul 4 : DASAR PEMROGRAMAN BERORIENTASI OBJEK
 
## Dasar Teori
* Information Hiding
 Adalah menyembunyikan attribute suatu objek dari objek lain.
*  Enkapulasi
Adalah menyembunyikan method suatu objek dari objek lain.
* Constructor
Merupakan suatu method khusus yang digunakan untuk menganalisasi objek. Constructor dibuat setelah class sudah dibuat dan constructor juga dapat diikuti sebuah atau banyak parameter.
* Overloading Constructor
Adalah kondisi dimana suatu class memiliki lebih dari 1 cunstructor dengan syarat daftar parameternya tidak boleh ada yang sama.
##
# **Praktikum**
 Soal : 
1. Buatlah 2 Class StudentRecord dan StudentRecordExample dalam project kemudian analisa
Jawaban : 
1. [Jawaban Soal](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/tree/Modul4/src/com/Dani/PBO/Modul4/Latihan)
Langkah awal buat _Class_ yang akan dipanggil kemudian 
* Tentukkan atribut yang digunakan,serta pastikan agar menggunakan enkapsulasi privat agar tidak dapat diakses oleh _class_ lain
```Java
private String name, address;
private int age;
private double mathGrade, englishGrade, scienceGrade, average;
private static int studentCode;
```
* Setelah nya buat _method getter_ dan _setter_ nya untuk melakukkan pemanggilan data dan memasukkan data dari _main_.
 ```Java
 public String getName(){
return name;
}

public void setName(String temp){
name = temp;
} 
```
Pada _getname_ menggunakkan pengembalian ke name karena nantinya saat dipanggil langsung menunjukkan dimana data tersebut berada. dan _SetName_ berguna untuk memasukkan nama tersebut,menggunakan _String temp_ sebagai wadah sementara dari masukkan kemudian dipindahkan ke _variabel name_.
* Kemudian membuat method bernama getAverage, seperti berikut
```Java
public double getAverage(){
double result = 0;
result = (mathGrade + englishGrade + scienceGrade) / 3;
return result;
}
```
_getAverage_ digunakan untuk mnghitung nilai dari masukan serta memiliki keluaran rata-rata / banyaknya pelajaran. getAverage berisi rumus dan akan mengembalikan nilai nya ke variable result.

* Kemudian membuat method tipe int untuk memanggil integer

```Java
public static int getStudentCount(){
return studentCode;
}
```
Method ini berisikan nilai dari yang didapat siswa dengan menggunakan tipe method void maka isinya menggunakan pengembalian/return yang diarahkan ke variable yang ditentukan.

* [StudentRecord](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul4/src/com/Dani/PBO/Modul4/Latihan/StudentRecord.java)

* Setelah itu membuat class ke 2 sebagai main atau juga bisa dipanggil class pemanggil, pada class pemanggil ini nantinnya akan berisikan method main untuk memanggil program yang sudah dibuat pada class sebelumnya, class ini digunakan untuk melakukan input langsung dari user. Jadi yang pertama dibuat adalah main, kemudain code sepetrti ini

```Java
StudentRecord Utii = new StudentRecord();
StudentRecord Ini = new StudentRecord();
StudentRecord Nama  = new StudentRecord();
```


ini merupakan cara memanggil class dari class lain dengan menggunakan '_Utii, Ini, dan Nama_' untuk variable yang akan dipanggil di class ini sebagai perantara pemanggilan dari class lain, dengan menggunakan overload constructor.

Kemudian membuat setter dari class yang ada
'''Java
Utii.setName("Utii");
Ini.setName("Ini");
Nama.setName("Nama");
'''
pada bgian ini merupakan mengisikan atau menempatkan String kedalam variable dari class sebelumnya dengan melalui method yang setName sesuai constructor yang sudah ditentukan

* Kemudian melakukan pemanggilan
```Java
System.out.println(Utii.getName());
System.out.println("Hitung\t: " +StudentRecord.getStudentCount());
'''
ini merupakan bagian pemanggilan menggunakan _getName._

* Kemudian running program apakah hasilnya sudah sesuai dengan yang diperkirakan atau tidak
    ````
    Utii
    Hitung : 0
    '''
    
hasilnya menujukan nama Utii sesuai parameternya Utii.getName dan Hitun : 0 karena belum dimasukan nilai untuk dihitung

* [StudentRecordExample](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul4/src/com/Dani/PBO/Modul4/Latihan/StudentRecordExample.java)

# Kesimpulan
Kesimpulan praktikum pemrograman pada modul 4 kali ini adalah mempelajari bagaimana menggunakan constructor dalam java serta pemnaggilan constructor di class lain. Serta mempelajari mengenai enkapsulasi pada class dan method serta atribut pada java. 
