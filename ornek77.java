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
import java.util.Scanner;
public class ornek77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);


System.out.println("lütfen n sayısını giriniz:");
   int n =input.nextInt();
   int  a=3,b=1,c=3;
   double t=1;
        for (int i = 1; i <n; i++) {
            b=b*(-1);
            double f=(double)1/(c*a);
            t=(double)t+b*f;
            a=a*3;
            c=c+2;
            
        }System.out.println(t);
        }
    
    
}
