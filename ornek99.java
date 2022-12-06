/*
1 başla 
2 sayıyı al x ve y 
3 x%10=a
4 y%10=b
5 eğer i==a3+b3+c3 değil ise git adım 8
6 x/10=c
7 y/10=d
8 eğer c==d değil ise git adım 10 
9 yazdır  sayılar kardeştir 
10 bitir
*/
package ödev_6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ornek99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen sayı giriniz:");
int  x = input.nextInt();

  System.out.println("lütfen sayı giriniz");
  int y=input.nextInt();
  int a ,b ,c ,d;
  
  a=x%10;
  b=y%10;
        if (a+b==10) {
            c=x/10;
            d=y/10;
            if (c==d) {
                System.out.println("sayılar kardeştir");
            }
        }
  
  
    }
    
}
