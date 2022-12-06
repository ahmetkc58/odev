/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev_6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ornek104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

        for (int i = 1; i <=50; i++) {
            for (int j = 1; j <= 50; j++) {
                for (int k = 1; k <= 50 ; k++) {
                    if (i*i+j*j+k*k==3*i*j*k) {
                        System.out.print(i+","+j);
                        System.out.println(","+k);
                    }
                }
            }
        }
    }
    
}
