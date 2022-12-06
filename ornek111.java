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
public class ornek111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen terim sayısını giriniz:");
int n =input.nextInt();
int t1=1, t2=1;
int t3;
        for (int i = 1; i <=n; i++) {
       t3=t1+t2;
       t1=t2;
       t2=t3;
       System.out.println(t3);
               
        }


       }
    
}
