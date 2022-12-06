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

public class ornek96 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen sayıyı giriniz:");
int n =input.nextInt();

double k =(double)(n-1)/4;
int a =(int )k;
        if (k-a==0) {
            System.out.println("hilbert sayılar");
        }else {
        System.out.println("sayı yanlış");
        }
    }
    
}
