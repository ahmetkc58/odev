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
public class ornek117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen n sayısını giriniz:");
int n =input.nextInt();

double p1 =0;
double p2=1;
double p3;
System.out.println("p1:"+p1);
System.out.println("p2:"+p2);

        for (int i = 1; i <n-1; i++) {
           p3=(2*p2)+p1;
           System.out.print(p3+",");
           p1=p2;
           p2=p3;
        }
    }
    
}
