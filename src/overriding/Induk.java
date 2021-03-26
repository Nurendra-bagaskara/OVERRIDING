/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Induk {
    // deklarasi variable instance
    String nama, kelas;
    int nis;

    // method Data Siswa dan penerapan Overriding
    public void DataSiswa() {
        System.out.println("Nama\t: ");
        System.out.println("Kelas\t: ");
        System.out.println("NIS\t: ");
    }
    
    //method penilaian
    public void penilaian() {
        //input nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Ulangan Harian 1\t: ");
        int uh1 = input.nextInt();
        System.out.print("Masukan Nilai Ulangan Harian 2\t: ");
        int uh2 = input.nextInt();
        System.out.print("Masukan Nilai Ulangan Harian 3\t: ");
        int uh3 = input.nextInt();
        System.out.println("-------------------------------------");

        // aritmatika rata-rata nilai
        //deklarasi variabel hasil
        int hasil = (uh1 + uh2 + uh3) / 3;
        //percabangan menentukan kondisi
        if (hasil > 100) {
            System.out.println("Eror...");
        } else if (hasil >= 90) {
            System.out.println("Rata-rata Nilai Ulangan Harian\t: " + hasil);
            System.out.println("Dengan Grade A");
            System.out.println("Pertahankan prestasimu....");
        } else if (hasil >= 80) {
            System.out.println("Rata-rata Nilai Ulangan Harian\t: " + hasil);
            System.out.println("Dengan Grade B");
            System.out.println("Pertahankan prestasimu....");
        } else if (hasil >= 70) {
            System.out.println("Rata-rata Nilai Ulangan Harian\t: " + hasil);
            System.out.println("Dengan Grade C");
            System.out.println("Semangat Belajar....");
        } else {
            System.out.println("Rata-rata Nilai Ulangan Harianh\t: " + hasil);
            System.out.println("Dengan Grade D");
            System.out.println("Semangat Dan Lebih Giat Belajar....");
        }
        System.out.println("=====================================");

    }
}
