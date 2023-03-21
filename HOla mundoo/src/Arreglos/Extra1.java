/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos números quiere que tenga el vector?");
        int n = leer.nextInt();
        int [] suma = new int [n];
        System.out.println("Ingrese los "+ n +" números que quiere sumar:");
        for (int i = 0; i < n; i++) {
            suma [i] =  leer.nextInt();
       }
        int total=0;
        for (int i = 0; i < n; i++) {
            total = total + suma [i];
       }
        System.out.println("La suma de todos los números da: " + total);
    }
    
}
