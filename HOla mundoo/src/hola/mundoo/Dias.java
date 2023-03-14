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
public class Dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int min = leer.nextInt();
        int hora = min / 60;
        int dias = min / 1440;
        
            
       hora = (hora - (dias * 24));
       
        System.out.println("Son " + dias + " dias y " + hora + " horas"); 
    }
}
