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
public class ornek88 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen sayıyı giriniz:");
int a =input.nextInt();

int b=2;
        while (a>1) {            
            if (a%b==0) {
              System.out.println(b);
              a=a/b;
            }else{
            b=b+1;
            }
        }
    }
    
}
