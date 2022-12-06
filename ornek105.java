/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev_6;

/**
 *
 * @author Lenovo
 */
import java.lang.Math;
import java.util.Scanner;

public class ornek105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        int n = input.nextInt();
        int t = 0, b = 0;
        int k;
        for (k = 1; k <= n; k++) {
            if (n % k == 0) {

                t = t + k;
                b++;

            }
        }
        

        double w=(double )t/b;
      System.out.println(w);
        
        
        if ((w) - (int) (w) == 0) {
            System.out.println(n + "sayı aritmetik sayıdır");
        } else {
            System.out.println("sayı aritmetik değildir");
        }

    }

}
