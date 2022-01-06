# 20104024_Dani-Azka-Faz_Pemrograman2
## Praktikum Pemrograman 2

<hr>

# Modul 9 : Exception

## Dasar Teori

* _Exception_

merupakan objek yang akan mempresentasikan atau melempar atau menghandel suatu kondisi pada java ketika terjadi _error_, yang kemudian akan melakukan pencegahan sehingga kondisi tersebut dapat berjalan normal. Jika _exception_ tidak ditangani maka program akan berhenti secara tidak normal.

Exception terdapat lima keyword yang digunakan oleh Java untuk menangani exception yaitu ``` try, catch, finally, throw dan throws ````.

* Tipe-tipe _Exception_ (_Checked _Exception__ dan _Unchecked _Exception__)

> _Checked Exception_

_Checked exceptions_ merupakan exception yang diketahui pada saat compile time. Namun, ada juga _exceptions_ yang dicek pada saat compile time, oleh karena itu mereka disebut dengan _compile time exceptions_.

_Compile time error_ akan terjadi bila exceptions ini tidak ditangani dengan menggunakan _blok try-catch_ atau dengan menggunakan _keyword throws_. 
CONTOH

```java
    public static void main(String[] args){
        try{
            Class.forName("NamaClassApaSaja");
        }
        catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException akan ditangkap di sini");
        }
    }
```

> _Unchecked Exception_


_Unchecked exception_ merupakan _exception_ yang terjadi pada saat _runtime_. Pada saat _compile time_ semuanya akan berjalan normal, namun ketika _runtime_ maka akan terlempar _exception_ ini. Oleh sebab itulah _uncheked exceptions_ disebut juga dengan _runtime exceptions_.

_Compile time error_ tidak akan terjadi jika ada pernyataan dalam program yang melemparkan _unchecked exception_ ini. meskipun anda tidak menanganinya dengan _blok try-catch_ atau _keyword throws_. Bagaimanapun, program akan gagal ketika dijalankan walaupun akan sukses pada saat di _compile_.

```java
public static void main(String[] args){ 
    try{
        int i = Integer.parseInt("Java");    
    } catch (NumberFormatException ex){
        System.out.println("NumberFormatException akan ditangkap di sini");
    }
}
```


* Menangani exception menggunakan try, catch, finally, throw dan throws

> _try-catch_

_try-catch_ merupakan statement penanganan _error_, statement ini digunakan untuk **mengurung eksekusi yang menampilkan eror dan dapat membuat program membuat program tetap berjalan tanpa dihentikan secara langsung.**

``` _try_ ``` merupakan pernyataan yang memungkinkan untuk menentukan blok kode yang akan diuji untuk kesalahan ketika sedang dijalankan.

``` _catch_ ``` merupakan pernyataan yang memungkinkan untuk menentukan blok kode yang akan dieksekusi, jika terjadi kesalahan dalam blok try.

Contoh struktur try-catch

```java
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
```

> _finally_


Statement _finally_ digunakan untuk menempatkan code penting yang tetap akan dijalankan, yang nantinya blok atau statement tersebut akan mengeksekusi apakah Exception akan naik atau tidak dan apakah exception akan ditangani atau tidak.

```java
public static void main(String[] args){
    try {
        System.out.println("Inside try block");
    // Throw an Arithmetic exception
        System.out.println(34 / 0);
    }
  
    // Can not accept Arithmetic type exception
    // Only accept Null Pointer type Exception
    catch (NullPointerException e) {
    System.out.println(
        "catch : exception not handled.");
    }
  
    // Always execute
    finally {
        System.out.println("finally : i will execute always.");
    }
    // This will not execute
    System.out.println("i want to run");
}
```

Perumpamaan pengunaan finally pada permasalahannya mobil mogok

```java
try{ mobil mogok
} catch (Memanggil bengkel) {
} catch (Dorong Mobil) {
} finally (diperbaiki bengkel)
}
```

Dengan program tersebut misal berjalan yaitu,

mobil mogok, memanggil bengkel, diperbaiki bengkel

atau bisa juga

mobil mogok, dorong mobil, diperbaiki bengkel

> _throw dan throws_


_Throw_ digunakan untuk melempar _exception_ dari _code_ atau blok code apapun secara _expisit_. _keyword throw_ dapat digunakan untuk melakukan pelemparan exception khusus.

Throws digunakan untuk mendeklarasikan exception yang biasanya digunakan bersama dengan exception blok try-catch.

<hr>

## Praktikum

Soal : 

1.  Mengidentifikasi soal Latihan modul 9

Jawab : 

1. [Jawaban Soal](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/tree/Modul9/src/com/Dani/PBO/Modul9/Latihan)

* [Latihan 1](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/tree/Modul9/src/com/Dani/PBO/Modul9/Latihan/Latihan1)

Pada latihan 1 menggunakan tipe _exception FileNotFoundException_ yang menggunakan _exception throws._

``` java
import java.io.FileNotFoundException;

public class percobaan7 {
    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException("File Tidak Ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
```

Pada program diatas dijalankan mulai dari _main_, ketika _main_ dijalankan akan mengeksekusi code exception try yang mana yaitu percobaan didalamnya adalah method _method1()_.

Pada method1 menggunakan exception throws untuk menangai terjadinya kesalahan pada file _"FileNotFoundException"_.

Kemudian setelah selesai program ditangkap atau catch yang menggunakan "FileNotFoundException" juga sebagai tipe exceptionnya, Kemudian program akan menampilkan hasil pada throw dengan melakukan pemanggilan getMassage dari throw.

Outputnya

``` File Tidak Ada ```


[Class](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul9/src/com/Dani/PBO/Modul9/Latihan/Latihan1/Percobaan.java)

* [Latihan 2](https://github.com/Alissyah/20104013_Alissyah-Putri_Pemrograman2/tree/Modul9/src/Modul9/Latihan/Latihan2)

Pada Latihan2 menggunakan exception try-catch, untuk menghedel error program tipe angka atau data.

```java
package Modul9.latihan.Latihan2;

import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukan Angka\t: ");
            int num = sc.nextInt();
            if (num>10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s){
            System.out.println("Angka lebih dari 10");
            System.out.println("Selesai");
        }
    }
}
```

Program diatas ketika dijalankan akan melakukan proses yang sebagai berikut.

Pada percobaan diatas _"try"_ program akan meminta masukan dari _user_ berupa angka. Kemudian program akan melakukan seleksi if masukan lebih dari 10 maka hasilnya akan dilempar dan akan melakukan Exception. dan jika tidak atau memenuhi syarat program kurang dari 10 maka akan mencetak "Angka kurang dari atau sama dengan 10".

Jika masukan dari user lebih dari 10 maka akan ditangkap "catch" berdasarkan exception atau syarat yang sudah ditentukan. Kemudian akan mencetak "Angka lebih dari 10" dan "Selesai"

Output

Jika masukan kurang dari 10

```java
Masukan Angka	: 1
Angka kurang dari atau sama dengan 10
```

Jika masukan lebih dari 10

```java
Masukan Angka	: 11
Angka lebih dari 10
Selesai
```

[Class](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/tree/Modul9/src/com/Dani/PBO/Modul9/Latihan/Latihan2)

* [Latihan 3](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/tree/Modul9/src/com/Dani/PBO/Modul9/Latihan/Latihan3)

```java
import javax.swing.*;

class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}
    
public class Demo {
    public static void main( String args[] ){
        try {
            throw new ExceptionC();
        } catch( ExceptionA a ) {
            JOptionPane.showMessageDialog( null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE ); 
        } try {
            throw new ExceptionB(); 
        } catch( ExceptionA b ) {
            JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE );
        }
    System.exit( 0 );
    }
}
```

Pada saat program dijalankan, program akan menjalankan syntax exception try, yang berisikan statement throw new ExceptionC(); yaitu melakukan throw pada class yang telah dideklarasikan berdasarkan ExceptionC. Kemudian pada catch menampilkan hasil menggunakan JOptionPane dengan isi berdasarkan INFORMATION.MASSAGE.

Kemudian pada program try selanjutnya berisikan syntax yang berisikan statement throw new ExceptionB(); yang kemudian program ini melakukan throw pada class yang telah dideklarasikan. Pada catch akan menampilkan penanganan errornya yaitu akan mencetak berdasarkan JOptionPane dengan isi berdasarkan INFORMATION.MASSAGE.

program system.exit(0); digunakan untuk keluar dari JOptionPane atau program Pane.

output

try pertama, throw ExceptionC

```java
Exception
Modul9.latihan.Latihan3.ExceptionC
```

try kedua, throw ExceptionB

```java
Exception
Modul9.latihan.Latihan3.ExceptionB
```

[Demo Sebagai Main](https://github.com/DaniAFZ/20104024_Dani-Azka-Faz_Pemrograman2/blob/Modul9/src/com/Dani/PBO/Modul9/Latihan/Latihan3/Demo.java)

<hr>

## Kesimpulan

Kesimpulan praktikum pemrograman pada modul 9

Pada modul 9 mempelajari mengenai exception handling yaitu penanganan ketika terjadi masalah atau error code. Pengunaan exception digunakan pada error code nya dan penanganan yang sesuai jika terjadi error.

Exception sendiri terdapat beberapa tipe atau jenis dan salah satunya adalah Checked Exception dan Unchecked Exception.

Kemudian mempelajari penggunaan try, catch, finally, throw dan throws serta contoh penggunaanya. Yang mana penggunaan try-catch dilakukan bersamaan dan try berisikan syntax yang mungkin akan terjadi error atau yang menyebabkan exception. Dan Catch berisikan penanganan error dari program try.

throw dan throws, yaitu melempar program yang kemungkinan akan terjadi error dan kemudian nantinya akan dilakukan pemanggilannya denga menambahkan exception solusinya.

finally digunakan untuk mencetak dari program yang dijalankan atau akhir dari peogram yang dijalakan walau hasilnya normal atau berdasarkan exception yang telah dijalankan

