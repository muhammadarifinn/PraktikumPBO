/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pmodul2;
/**
 *
 * @author ASUS
 */

// membuat class
class Mahasiswa1 {
    // memebuat attribut
    int umur;
    String nama,alamat,jk;
    
    //membuat paramater
    Mahasiswa1 (String inama,String ialamat, String ijk,int iumur) {
        nama = inama;
        alamat = ialamat;
        jk = ijk;
        umur = iumur;
        
    //tampil objek 1
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(jk);
        System.out.println(umur);
        System.out.println("=================");
    }
}

public class Main1 {
    public static void main(String[] args) {
    // membuat objek 1
        Mahasiswa1 s1 = new Mahasiswa1 ("Naura","Ponorogo","Perempuan",20);
    // membuat objek 2
        Mahasiswa1 s2 = new Mahasiswa1 ("Aisa","Jogja","Perempuan",21);
    }
}
