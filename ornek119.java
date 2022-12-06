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
public class ornek119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("n sayısını giriniz:");
int n =input.nextInt();
int s=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(s);
                s+=s;
                System.out.println();
            }
        }
    }
    
}
