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
import java.util.Scanner ;
public class ornek95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen x değerini giriniz:");
int x =input.nextInt();

System.out.println("lütfen y değerini giriniz:");
int y =input.nextInt();

        for (int i = 1; i <=x; i++) {
            for (int j = 1; j <=y; j++) {
                double a=Math.pow(i, j);
                double b=Math.pow(j , i);
                double t=a+b;
                System.out.println(t);
            }
        }

    }
    
}
