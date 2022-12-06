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
import java.lang.Math;
public class ornek92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen max değeri giriniz:");
int n =input.nextInt();

        for (int i =1; i <=n; i++) {
            int s=0;
            int x=(int) Math.pow(2, i+1)-1;
            for (int j = 1; j <=i; j=j+2) {
                if (x%j==0) {
                    s++;
                }
            }if (s==1) {
                 int MS =(int ) Math.pow(2, i)*x;
                System.out.println(MS);
            }
        }
    }
    
}
