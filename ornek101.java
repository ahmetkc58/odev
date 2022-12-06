/*
1 BAŞLA 
2 t=0
3 i =1 n e kadar  1 er 1 er arttır değilse git adım 6  
4 eğer n%i==0 değil ise adım 5
5 t++
6 eğer n%t==0 değil ise 8 
7 tau sayısıdır 
8 tau s ayısı değildir
9 bitir
*/
package ödev_6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ornek101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
System.out.println("lütfen sayıyı giriniz:");
int n  =input.nextInt();
int t =0;

        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                t++;
                
            }
        }
        if (n%t==0) {
            System.out.println("sayı tau sayısıdır:");
            
        }else{
        System.out.println("sayı tau sayısı değildir:");
        }
    }
    
}
