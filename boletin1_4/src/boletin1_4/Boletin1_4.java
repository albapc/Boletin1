
package boletin1_4;

import java.util.Scanner;


public class Boletin1_4 {

    
    public static void main(String[] args) {
       double num1=0, num2=0;
       
       Scanner operacions = new Scanner (System.in);
       System.out.println("Introduce dos números:");
       num1=operacions.nextDouble();
       num2=operacions.nextDouble();
       
       double suma= num1+num2;
       System.out.println("Suma= "+suma);
       
       double resta= num1-num2;
       System.out.println("Resta= "+resta);
       
       double producto= num1*num2;
       System.out.println("Producto= "+producto);
       
       float cociente= num1/num2;
       System.out.println("Cociente= "+cociente);
    }
    
}
