
package boletin1_3;

import java.util.Scanner;


public class Boletin1_3 {

    
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        float euros=0, dolares=0;
        System.out.println("Teclea la cantidad en euros:");
        euros=ler.nextFloat();
        dolares=euros*1.14f;
        System.out.println(euros+" euros son "+dolares+" dólares.");
    }
    
}
