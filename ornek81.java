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
public class ornek81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen tekrar sayısını giriniz:");
int n=input.nextInt();
double t=1;

        for (int i = 1; i <=n; i++) {
        t=(double)1+(1/(2+1/t));            
        }
        double x=1+1/t;
System.out.println(x);
    }
    
}
