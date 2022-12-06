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
public class ornek70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen x sayısını giriniz:");
int x =input.nextInt();

System.out.println("lütfen terim sayısını giriniz:");
int n=input.nextInt();

double t=x , a=3, b=1;
double f=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= a; j++) {
                f=f*j;
                
            }
            double ü = Math.pow(x, a);
            t=(double)t-(ü*b)/f;
            f=1;
            System.out.println(b);
            a=a+2 ;
            b=b*(-1);
            
            //mat.pow
        }
        System.out.println("sonuç :"+t);
    }
    
}
