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
public class ornek120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new   Scanner (System.in);

System.out.println("lütfen a sayısını giriniz:");
int a =input.nextInt();
System.out.println("lütfen b sayısını giriniz:");
int b =input.nextInt();
System.out.println("lütfen c sayısını giriniz:");
int c =input.nextInt();
System.out.println("lütfen n sayısını giriniz:");
int n =input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (a*a+b*b==c*c) {
                if (a+b+c==i) {
                    System.out.print(a+",");
                    System.out.print(b+",");
                    System.out.print(c);
                }
            }
        }
    }
    
}
