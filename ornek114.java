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
public class ornek114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfenen  sayısını giriniz:");
int n =input.nextInt();
int f3;
int f1=1,f2=(-1);
System.out.println("f1:"+f1);
System.out.println("f2:"+f2);
        for (int i = 1; i <n-1; i++) {
            f3=f1-f2;
            System.out.println("f3:"+f3);
            f1=f2;
            f2=f3;
            
       }
    }
    
}
