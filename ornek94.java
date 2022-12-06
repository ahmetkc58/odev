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
public class ornek94 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen max değeri giriniz:");
int n =input.nextInt();

        for (int i = 1; i <n; i++) {
            int a=(int)Math.pow(2, i);
            double x =(double )Math.pow(2,a)+1;
            System.out.println(x);
        }
    }
    
}
