/*

*/
package ödev_6;

/**
 *
 * @author Lenovo
 */
import java.lang.Math;
import java.util.Scanner;
public class ornek69 {                          

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
System.out.println("lütfen dereceyi giriniz:");
int  d=input.nextInt();
    double x=Math.toRadians(d);

System.out.println("lütfen tekrar sayısını  giriniz:");
int N=input.nextInt();
double  t =1 ,b=2,n=2,a=1 ;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= b;j++) {
                a=a*j;

            }                x=x*(-1);
                t =t+(x*n)/a;
                n=n+2;
                b=b+2;
                a=1;
            }
        System.out.println(t);
        
        System.out.println("---------------------------------------");
        
        
        
        
    }
    
}
