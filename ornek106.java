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
public class ornek106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

        for (int i =100; i <=999; i++) {
            int t=0;
            int x=i;
            while (x>0) {                
                int a =x%10;
                x=x/10;
                t=(t+a)*10;
            }
            if (i*10==t) {
                System.out.println("i:"+i);
            }
        }
        }
    }
    

