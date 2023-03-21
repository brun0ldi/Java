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
public class Sopa {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 5 palabras que tengan entre 3 y 5 letras c/u)");
        String palabra [] = new String [5];
        String sopa [] [] = new String [20] [20];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra " + (i+1));
            palabra [i] = leer.next();
            
            
            while (palabra[i].length() < 3 || palabra[i].length() > 5);{
            System.out.println("Su palabra no cumple con la cantidad de caracteres");
            System.out.println("Ingrese una que si cumpla:");
            palabra[i] = leer.next();
            }
        
        }
    }   
    }
    

