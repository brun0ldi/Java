/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundoo;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, j;
        Scanner Teclado = new Scanner(System.in);
        n= Teclado.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                
            }
            System.out.print("*");  
        }        
    }
    
}
