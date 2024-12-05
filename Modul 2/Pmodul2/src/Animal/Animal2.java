/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author ASUS
 */
class a2 {
    String namahwn,warnabulu;
    int umur;
    
    a2 (String inamahwn,String iwarnabulu,int iumur){
        namahwn = inamahwn;
        warnabulu = iwarnabulu;
        umur = iumur;
        
        System.out.println(namahwn);
        System.out.println(warnabulu);
        System.out.println(umur);
        System.out.println("================="); 
    }
}
public class Animal2 {
    public static void main(String[] args) {
        // TODO code application logic here
        a2 cat1 = new a2("Sashi","Putih",2);
        a2 cat2 = new a2("Ciko","Belang",5);
        a2 cat3 = new a2("Kopeng","Oren",4);
    }   
}
