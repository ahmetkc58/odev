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
import java.util.Scanner ;
public class ornek78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
System.out.println("lütfen terim sayısını giriniz:");
int n=input.nextInt();
double a ,t=1;
        for (int i = 1; i <= n; i++) {
      a=4*i*i;
      double x=(double)a/(a-1);
      t=(double)t*x;
      
        }
        t=t*2;
        System.out.println("pi değerinin yaklaşık değeri :"+t);
    }
    
}
