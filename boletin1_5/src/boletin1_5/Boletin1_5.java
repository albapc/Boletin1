
package boletin1_5;

import java.util.Scanner;


public class Boletin1_5 {

    
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        float metros=0f, millas_marinas=0f;
        System.out.println("Introduce el número en millas marinas");
        millas_marinas=ler.nextFloat();
        metros= millas_marinas*1852f;
        System.out.println(millas_marinas+" millas marinas son "+metros+" metros.");
    }
    
}
