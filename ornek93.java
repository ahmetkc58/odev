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
public class ornek93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen max değerini giriniz:");
int n =input.nextInt();

        for (int i = 1; i <= n; i++) {
            int x =(int)Math.pow(2, i+1)+1;
            System.out.println(x);
        }
    }
    
}
