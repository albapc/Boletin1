
package boletin1_5;

import java.util.Scanner;


public class Boletin1_5 {

    
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double metros=0f, millas_marinas=0f, 
        final double m1=1852;
        System.out.println("Introduce el número en millas marinas");
        millas_marinas=ler.nextFloat();
        metros= millas_marinas*m1;
        System.out.println(millas_marinas+" millas marinas son "+metros+" metros.");
    }
    
}
