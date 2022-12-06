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
public class ornek102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen sayı giriniz:");
int n =input.nextInt();
int x;
        for (int i = 1; i <= n; i++) {
      x=i*(i+1);
System.out.print(x+"="+i);
System.out.println("*"+(i+1));
        }
    }
    
}
