/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 10 números que tengan de 1 a 5 digitos");
        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
           
            vector [i] =  leer.nextInt();
            
        }
        int undig,dosdig, tresdig, cuatrodig, seisdig;
        
        for (int i = 0; i < 10; i++) {
            String digitos = String.valueOf(vector[i]);
int numDigits = digitos.length();
System.out.println("El número " + vector [i] + " tiene " + numDigits + " dígitos");
 }
    }
    
}
