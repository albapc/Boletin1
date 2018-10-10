
package boletin1_3;

import java.util.Scanner;


public class Boletin1_3 {

    
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        float euros=0f, dolares=0f, cambio=0f;
        System.out.println("Teclea la cantidad en euros:");
        euros=ler.nextFloat();
        System.out.println("Introduce el cambio);
        cambio=ler.nextFloat();
        dolares=euros*cambio;
        System.out.println(euros+" euros son "+dolares+" dólares.");
    }
    
}
