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
public class ornek109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen tekrar sayısını giriniz:");
int n=input.nextInt();
int t=1,s=1;

        for (int i =1; i <=n; i++) {
            s=s+t;
            t++;
            System.out.println(s-1);
        }
    }
    
}
