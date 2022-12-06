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
public class ornek103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen sayıyı giriniz:");
int n=input.nextInt();
int t=0,s=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                s++ ;
              t=t+(1/i);
                n=n/i;
            }
        }double so=s/t;
        if (so-(int)so==0) {
            System.out.println("ore sayısıdır:");
        }else{
        System.out.println("sayı ore sayısı değildir :");
        }

        
        

    }
    
}
