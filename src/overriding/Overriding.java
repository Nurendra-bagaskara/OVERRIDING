/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ASUS
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objek pemanggilan
        Induk input= new Anak();
        input.DataSiswa();
        input.penilaian();
    }
    
}
