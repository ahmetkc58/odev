/*
1 başla 
2 sayıyı al(n) 
3 b=m/a+2^.5
3 a=n-b
4 yazdır 
5 bitir
*/
package ödev_6;

/**
 *
 * @author Lenovo
 */
import java.lang.Math;
import java.util.Scanner ;
public class ornek85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("lütfen sayı girinniz:");
int n=input.nextInt();


double b=n/(1+(Math.pow(2, 0.5)));
double a=n-b;

System.out.println("1. kısımı "+a);
System.out.println("2.kısımı:"+b);

    }
    
}
