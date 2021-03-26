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
// menerapkan extends 
public class Anak extends Induk {

    // method Data Siswa dan penerapan Overriding
    public void DataSiswa() {
        Scanner input=new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Nama\t: ");
        nama = input.nextLine();
        System.out.print("Kelas\t: ");
        kelas = input.nextLine();
        System.out.print("NIS\t: ");
        nis = input.nextInt();
        System.out.println("-------------------------------------");
    }
}
