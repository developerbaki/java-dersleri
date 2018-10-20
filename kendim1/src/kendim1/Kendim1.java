/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendim1;

/**
 *
 * @author baki
 */
public class Kendim1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Yazıyorsak Bir Sebebi Var.";
        s = s.toUpperCase();
        System.out.println( s );
        int İlkbosluk = s.indexOf(" ");
        String İlkkelime= s.substring(0, İlkbosluk);
        System.out.println("İlk kelime=" + İlkkelime);
        int sonbosluk = s.lastIndexOf(" ");
        String sonkelime = s.substring(sonbosluk);
        System.out.println("Son Kelime = " +sonkelime );
    }
    
}
