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
public class ornek110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen terim sayısını giriniz:");
int n =input.nextInt();
int t =0;
        for (int i = 1; i <n; i++) {
            
            if (i==t) {
                System.out.println("üçken oldu ");
                for (int j = 1; j < n; j++) {
                    if (j*j==i) {
                        System.out.println(i);
                    }
                }
            }
            t=t+i;
            System.out.println("t:"+t);
        }
    }
    
}
