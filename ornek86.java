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
public class ornek86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen max değeri giriniz:");
int n =input.nextInt();
int s;
        for (int i = 2; i <=n; i++) {
      s=0;      
            for (int j = 2; j <=i; j++) {
                if (i%j==0) {
                   s++;
                }
            }
            if (s==1) {
                System.out.println(i+","+s);
            }
        }

    }
    
}
