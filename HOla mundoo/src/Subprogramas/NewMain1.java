/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean bucle = true;
        do {
            System.out.println("Ingrese el nombre");
            String n = leer.next();
            System.out.println("¿Qué edad tiene " + n + "?");
            int e = leer.nextInt();
            if (e<18){
                System.out.println(n+ " es menor de edad");
            }else{
                System.out.println(n+ " es mayor de edad");
            }
            System.out.println("¿Quiere agregar a otra persona?");
            String salir = leer.next();
            if (salir.equalsIgnoreCase("n")){
                    System.out.println("Saliendo del programa");
                    bucle = false;
                    
                }else if (salir.equalsIgnoreCase("s")){
                    System.out.println("Volviendo al ingreso");    
                
                }else {
                    System.out.println("La respuesta es incorrecta volviendo al MENU");
                }
    } while (bucle); 
    
}
}
