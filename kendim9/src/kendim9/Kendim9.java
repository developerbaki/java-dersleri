/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendim9;

/**
 *
 * @author baki
 */
public class Kendim9 {
//güzel oldu
    public static int fib(int i) {
        if (i == 0) {
            return 1;
        }

        if (i == 1) {
            return 1;
        }

        return fib(i - 1) + fib(i - 2);
    }

    static double faktoriyel(int a) {
        double f = 0, c = 0;
        for (int i = a; i >= 1; i--) {
            if (c == 0) {
                f = i * (i - 1);
            } else if ((i - 1) != 0) {

                f *= (i - 1);
            }
            c++;
        }
        System.out.println(" " + a + " " + f);
        return f;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int a = 0; a < 10; a++) {
            faktoriyel(fib(a));
        }
    }

}
