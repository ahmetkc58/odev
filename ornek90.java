package ödev_6;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class ornek90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen sayıyı giriniz:");
        int n = input.nextInt();

        int[] sayı = new int[n];
        int s = 0;
        for (int i = 1; i <= n; i++) {
            int k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {//asallık kontrol ediliyor
                    k = k + 1;
                }
            }
            if (k == 0) {
                s++;//asal ise s . elemana i değerini atıyor
                sayı[s] = i;
            }
        }
        for (int i = 1; i < s; i++) {//s tane asal sayı vardır 
            if (sayı[i + 1] - sayı[i] == 2) {
                System.out.println("1.sayı:" + sayı[i]);
                System.out.println("2.sayı:" + sayı[i + 1]);
            }
        }

    }

}
