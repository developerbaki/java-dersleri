/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendim7;

/**
 *
 * @author baki
 */
public class Kendim7 {
static int f(int a){
return (a+2)*5;
}
static int g(int b){
return b*2;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b= 2;
        System.out.println(f(g(b)));
    }
    
}
