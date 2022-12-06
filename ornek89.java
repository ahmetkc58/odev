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
public class ornek89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        
        System.out.println("lütfen asallığı sorgulanacak sayıyı giriniz:");
        int sayı=input.nextInt();
        
        int b =2;
        if(b<sayı){ 
        while (sayı%b!=0) {
            b++;    
        }
         if (sayı%b==0) {
                System.out.println("1.sayı asal değil:");
                System.out.println("sayının  asal olmamasını sağlayan sayı :"+b);
            }       
        
        }System.out.println("1.sayı asal");
        
        int a=2;
        if (a<sayı+2) {
            while ((sayı+2)%a!=0) {
                a++;
            }if ((sayı+2)%a==0) {
                System.out.println("sayı asal değildir ");
                System.out.println("sayının asal olmamasının sebebi:"+a);
            }
            
        }System.out.println("2. sayıda asaldır");
        System.out.println("1.sayı ve 2. sayı asal olduğundan bu sayı chen asalıdır: ");
        
        
        
        
        
    }
    
}
