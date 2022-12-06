package ödev_6;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class örnek69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);

int n , is;
double aci ,x,f,t=1;
System.out.print("açı değeri (derece):");
aci=input.nextDouble();
System.out.print("terim sayısı :");
n=input.nextInt();

x=Math.toRadians(aci);
is =1;
        for (int i = 1; i <n; i++) {
            f=1;
            for (int j = 1; j <2*i; j++) {
                f*=j;
                is*=(-1);
            t+=is*Math.pow(x, 2*i)/f;
            }
            
            
        }
System.out.printf("hesaplanan değer:"+t);
System.out.printf("hesaplanan değer: "+Math.cos(x));


    }
    
}
