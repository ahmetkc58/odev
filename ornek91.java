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
import ödev_5.*;
import java.util.Scanner;
import ödev.sayısaldeğer;

public class ornek91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen mükemmel sayı giriniz:");
        int sayı = input.nextInt();

        int t = 0, a = 1, b = 0;

        while (b <sayı) {
            if (sayı % a == 0) {
                t = t + a;
                a++;
                b++;
            } else {
                b++;
            }

        }
        if (t == sayı) {
            System.out.println(sayı + "sayı mükemmel sayıdır");
        }else{
        System.out.println("mükemmel sayı değildir");
    }
    }

}
