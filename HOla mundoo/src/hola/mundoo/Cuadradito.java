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
public class Cuadradito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt() ;
        
        for (int i = 1; i <= num ; i++) {
            
            for (int j = 1; j <= num; j++) {
                if ((i > 1  && i < num) && (j > 1 && j < num )){
                    System.out.print("  ");
                
                    
                    }else {
                    System.out.print("* ");
                }
                    
            
            
            }
            System.out.println(" ");
        }
        
    }
    
}
    
    

