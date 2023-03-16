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
public class NomEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean bucle = true;
        do {
            
            System.out.println(" MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR ");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR ");
            System.out.println("5. SALIR");
            System.out.println("ELIJA OPCION ");
            int option = leer.nextInt();
            String salir ;
            switch (option){
                case 1:
                    System.out.println("La suma de los numer es: "+ suma(num1, num2));
                    break ;
                case 2:
                    System.out.println("La resta de los numeros es: "+ resta(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: "+ multi(num1, num2));
                    break;
                case 4:
                    System.out.println("La division de los  numeros es: "+ div(num1, num2));
                    break;
                case 5:
                    System.out.println(" Esta seguro que desea salir del programa (S/N)?");
                salir = leer.next();
                if (salir.equalsIgnoreCase("s")){
                    System.out.println("Saliendo del programa");
                    bucle = false;
                    
                }else if (salir.equalsIgnoreCase("n")){
                    System.out.println("Volviendo al MENU");    
                
                }else {
                    System.out.println("La respuesta es incorrecta volviendo al MENU");
                }
                    
            } 
            
        } while (bucle); 
    }
    public static int suma (int num1, int num2) {
int resultado = num1 + num2;
return resultado;
}
    public static int resta (int num1, int num2) {
int resultado = num1 - num2;
return resultado;
}
    public static int multi (int num1, int num2) {
int resultado = num1 * num2;
return resultado;
}
    public static double div (double num1, double num2) {
double resultado = num1 / num2;
return (double) resultado;
}
}
