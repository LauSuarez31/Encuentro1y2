/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1suma;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author bauti
 */
public class Gui1suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
      Scanner leer = new Scanner (System.in);      
      
    System.out.println("ingrese el valor de dos numeros");
      int num1;
        num1 = leer.nextInt();
      int num2;
        num2 = leer.nextInt();
        int suma = num1 +num2;
        System.out.println("El resultado de la suma es: "+ suma);
    } 
   
}
