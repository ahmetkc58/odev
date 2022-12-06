/*
1 başla 
2 a b c x sayılarını al 
3 i=100 999 a kadar 1 er 1 er arttır dögü bitince adım 12 git 
   4 x sayısını i yeeşitle 
   5 a=x%10
6 x=x/10
7 b=x%10
8 x=x/10
9 c=x
10 eğer i==a3+b3+c3 değil ise git adım 12  
11 i yazdır
12 bitir

  
*/
package ödev_6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ornek98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
int a,b,c;
        for (int i = 100; i <=999; i++) {
          int x=i;
            a=x%10;
          x=x/10;
          b=x%10;
          x=x/10;
          c=x;
              if (i==a*a*a+b*b*b+c*c*c) {
                System.out.println(i);
            }
              
        }
    }
    
}
