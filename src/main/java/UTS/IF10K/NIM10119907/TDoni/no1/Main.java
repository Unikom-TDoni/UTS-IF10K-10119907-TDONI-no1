/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS.IF10K.NIM10119907.TDoni.no1;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk uts no 1
 */
public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var dateTime = LocalDateTime.now();
        var age = new Age(dateTime.getYear());
        System.out.println("Masukan Lahir Tahun Anda : ");
        var tahunLahir = scanner.nextInt();
        age.setYearBirth(tahunLahir);
        var umur = age;
        
        int yearBirth = age.getYearBirth();
        int yearNow = age.getYearNow();
        int hasilHitungUmur = age.hitungUmur();
        String status = age.tandanyaKamu(hasilHitungUmur);
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir : ".concat(Integer.toString(yearBirth)));
        System.out.println("Hari ini tahun : ".concat(Integer.toString(yearNow)));
        System.out.println("Umur kamu sampai hari ini adalah ".concat(Integer.toString(hasilHitungUmur)).concat(" Tahun"));
        System.out.println("Tandanya kamu ".concat(status));
    }
}
