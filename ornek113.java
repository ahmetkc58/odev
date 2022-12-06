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
public class ornek113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen tekrar sayısını giriniz:");
int  n =input.nextInt();
int s2=0;
        while (s2<n) {            
      int f1=1,f2=1;
int f3=f2+f1;
f1=f2;
  f2=f3;
int s1=0;
        for (int i = 2; i <f3; i++) {
            if (f3%i==0) {
                s1=s1+1;
            }
        }if (s1==0) {
            s2++;
            System.out.println("f3:"+f3);
        }      
        }

        
            
        
    }
    
}
