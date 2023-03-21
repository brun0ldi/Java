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
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos números de la secuencia quiere mostrar?");
        int n = leer.nextInt();
        int fibo [] = new int [n];
        int a = 1;
        int b= 1;
        int c;
        for (int i = 0; i < n; i++) {
            fibo[i] = a;
            c=a+b;
            a = b;
            b=c;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fibo[i]);
        }
        
    }
    
}
