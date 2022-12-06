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
public class ornek83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen AB uzunluğunu giriniz:");
double a=input.nextDouble();

double x=(double)Math.pow(5, 0.5);
System.out.println(x);
double c =(double)2*a/(1+x);
double b=(double)a-c;
System.out.println("AB:"+a);
System.out.println("AC:"+b);
System.out.println("CB:"+c);
    }
    
}
