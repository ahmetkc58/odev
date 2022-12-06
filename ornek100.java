/*
1 başla 
2 n sayısını al 
3 t=0
4 i=1 n e kadar 1 er 1 er arttır koşulu sağlamaz ise git adım 7
5 eğer n%i==0 değil ise adım 7  
6 t=t+i
7 eğer t<2n değil ise git adım 9 
8 yazdır eksik sayıdır
9 bitir
 */
package ödev_6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ornek100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("sayı giriniz:");
int n =input.nextInt();
int t =0;

        for (int i =1 ; i <=n; i++) {
            if (n%i==0) {
                t=t+i;
                
            }
        }
        if (t<2*n) {
            System.out.println("sayı eksik sayıdır :");
            
        }
    }
    
}
