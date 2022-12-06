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
public class ornek108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("C(n,m)     n ve m   giriniz:");
System.out.println("n giriniz:");
int n=input.nextInt();
System.out.println("m sayısını giriniz:");
int m =input.nextInt();
int t=1,x=1,y=1;
double s;
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <= (m+1); j++) {
                t=t*j;
            }
            for (int j = 1; j <=(m+1-i); j++) {
                x=x*j;
            }
            for (int j = 1; j <=i; j++) {
                y=y*j;
            }
            
         s=(double)Math.pow((-1), i)*(t/(x*y)*(double)Math.pow((n+1-i), m));
        System.out.println(s);
        }
    }
    
}
