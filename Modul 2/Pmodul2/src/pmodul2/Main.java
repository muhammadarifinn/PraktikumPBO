/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pmodul2;
/**
 *
 * @author ASUS
 */

// membuat class
class Mahasiswa {
    // memebuat attribut
    int umur;
    String nama,alamat,jk;
    }

public class Main {
    public static void main(String[] args) {
        // membuat objek 1
        Mahasiswa s1 = new Mahasiswa ();
        s1.nama = "Naura";
        s1.alamat = "Ponorogo";
        s1.jk = "Perempuan";
        s1.umur = 20;
        
        // membuat objek 2
        Mahasiswa s2 = new Mahasiswa ();
        s2.nama = "Aisa";
        s2.alamat = "Jogja";
        s2.jk = "Perempuan";
        s2.umur = 21;
        
        //tampil objek 1
        System.out.println(s1.nama);
        System.out.println(s1.alamat);
        System.out.println(s1.jk);
        System.out.println(s1.umur);
        System.out.println("=================");
        
        //tampil objek 2
        System.out.println(s2.nama);
        System.out.println(s2.alamat);
        System.out.println(s2.jk);
        System.out.println(s2.umur);
    }    
}
