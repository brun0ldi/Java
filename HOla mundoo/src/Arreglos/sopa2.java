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
public class sopa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] palabras = new String[5];
        
        // Pedir al usuario que ingrese las palabras
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + ": ");
            palabras[i] = scanner.nextLine();
            
            // Validar que la palabra tenga entre 3 y 5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese la palabra " + (i+1) + ": ");
                palabras[i] = scanner.nextLine();
            }
        }
        
        // Crear la sopa de letras
        char[][] sopa = new char[20][20];
        
        // Ubicar las palabras en filas aleatorias
        for (String palabra : palabras) {
            int fila = (int) (Math.random() * 20);
            int columna = 0;
            
            // Verificar si la palabra se superpone con otra palabra ya ubicada en la sopa de letras
            while (columna < palabra.length()) {
                if (fila >= 20 || sopa[fila][columna] != '\u0000') {
                    // La palabra se superpone con otra palabra ya ubicada, se selecciona una nueva fila aleatoria
                    fila = (int) (Math.random() * 20);
                    columna = 0;
                } else {
                    columna++;
                }
            }
            
            // Ubicar la palabra en la fila seleccionada
            for (int i = 0; i < palabra.length(); i++) {
                sopa[fila][i] = palabra.charAt(i);
            }
        }
        
        // Rellenar los espacios no utilizados con números aleatorios
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == '\u0000') {
                    sopa[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }
        
        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print("["+sopa[i][j] + "]");
            }
            System.out.println();
        }
    }

}