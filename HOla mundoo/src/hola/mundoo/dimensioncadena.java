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
public class dimensioncadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres ");
        String frase = leer.next();
        
        if (frase.length() == 8){
            System.out.println("CORRECTO");
        }else { System.out.println("INCORRECTO");
                    }  
        
        
        
    }
    
    
}
    
    

