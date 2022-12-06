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
import java.lang.Math ;
import java.util.Scanner ;
public class ornek84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen üçken'in kısa kenar'ını giriniz: ");
double n=input.nextDouble();
double k=Math.pow(5, 0.5);
double u=(1+k)*n/2;
System.out.println("uzun kenar :"+u);
System.out.print("kısa kenar:"+n);
    }
    
}
