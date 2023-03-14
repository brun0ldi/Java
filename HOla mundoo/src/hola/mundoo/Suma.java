/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundoo;
import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author bruno
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        int n1,n2;
   
        System.out.println("Ingresa 2 números");
        
        n1 = Teclado.nextInt();
        n2 = Teclado.nextInt();
        int n3 = n1 + n2;
                
        System.out.println("La suma da " + n3);
    }
    
}
