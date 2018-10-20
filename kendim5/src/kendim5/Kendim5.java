/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendim5;

/**
 *
 * @author baki
 */
public class Kendim5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=99; i>0; i= i-2){
        System.out.println(""+i);
        }
        for(int a=0; a<100; a++){
        if(a%7==0 && a%3==0 ){
            System.out.println(""+a);
                }
        }
        for(int i=2; i<100; i=i*2){
        System.out.println(""+i );
        }
        for(int a=0; a<10; a++){
        if(a%5==0){
        System.out.println(""+a);
        }
        }
    }
    
}
