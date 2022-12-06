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

public class ornek87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0, s = 0;
        for (int i = 10; i <= 100; i++) {
            int x = i % 10;
            for (int j = 1; j <= x; j=j+2) {// birler basamağı 
                a = 0;
                s = 0;
                
                if (x % j == 0) {
                    s++;
                }else if (x==2) {
                    s++;
                }
            }
            if (s == 1) {
                a++;
            }

            int y = i / 10;
            s = 0;
            for (int j = 1; j <= y; j=j+2) {
                if (y % j == 0) {
                    s++;
                }else if (y==2) {
                    s++;
                }
            }
            if (s == 1) {
                a++;
            } 
            if (a == 2) {
                System.out.println(i);
            }

        }
    }

}
