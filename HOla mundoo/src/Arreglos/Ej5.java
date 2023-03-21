/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author bruno
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int [] [] MatrizA = new int [4] [4];
                int [] [] MatrizB = new int [4] [4];
        
        System.out.println("La matriz original es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                MatrizA [i] [j] = (int) (Math.random()*8) + 1;
                System.out.print((MatrizA [i] [j]) + " " ) ;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La matriz inversa transpuesta es:");
                for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                MatrizB [i] [j] = MatrizA [i] [j] * -1;
                System.out.print((MatrizB [i] [j]) + " ");
            }
            System.out.println("");
        }
    }
    
}
