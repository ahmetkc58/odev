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
public class ornek97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen m sayısını giriniz:");
int m =input.nextInt();
System.out.println("lütfen n sayısını giriniz:");
int n =input.nextInt();
int T=0,t=0;
        for (int i = 1; i <=m; i++) {
            if (m%i==0) {
                m=m/i;
            T+=i;    
            }
        }for (int i = 1; i <=n; i++) {
            if (n%i==0) {
            n=n/i;
            t=t+i;
        }
        }
        if (T==n && t==m) {
            System.out.println("dost sayılar    ");
        }
    }
    
}
