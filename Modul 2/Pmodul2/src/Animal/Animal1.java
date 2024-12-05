/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animal;

/**
 *
 * @author ASUS
 */

class animal {
    String namahwn,warnabulu;
    int umur;
}

public class Animal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal cat1 = new animal ();
        cat1.namahwn = "Sashi";
        cat1.warnabulu = "Putih";
        cat1.umur = 2;
        
        //objek 2
        animal cat2 = new animal ();
        cat2.namahwn = "Ciko";
        cat2.warnabulu = "Belang";
        cat2.umur = 5;
        
        //objek 3
        animal cat3 = new animal ();
        cat3.namahwn = "Kopeng";
        cat3.warnabulu = "Oren";
        cat3.umur = 4;
        
        //tampil objek 1
        System.out.println(cat1.namahwn);
        System.out.println(cat1.warnabulu);
        System.out.println(cat1.umur + " tahun");
        System.out.println("=================");
        
        //tampil objek 2
        System.out.println(cat2.namahwn);
        System.out.println(cat2.warnabulu);
        System.out.println(cat2.umur + " tahun");
        System.out.println("=================");
        
        //tampil objek 3
        System.out.println(cat3.namahwn);
        System.out.println(cat3.warnabulu);
        System.out.println(cat3.umur + " tahun");
    }
    
}
