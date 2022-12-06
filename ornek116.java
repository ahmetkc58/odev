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
public class ornek116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner input=new Scanner (System.in);

System.out.println("lütfen f2 değerini giriniz:");
int f2=input.nextInt();

double ao=(1+Math.pow(5, 1/2));
int f1 =(int)(f2/ao);
int f3 =(int)(f2*ao);

System.out.println("f1:"+f1);
System.out.println("f2:"+f2);
System.out.println("f3:"+f3);
    }
    
}
