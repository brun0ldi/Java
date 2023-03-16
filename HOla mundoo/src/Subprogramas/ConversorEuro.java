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
public class ConversorEuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        int euro = leer.nextInt();
        System.out.println("¿A qué moneda quiere hacer la conversión?(libras/yenes/dolares)");
        String moneda = leer.next();
        String moneda2 = moneda.toLowerCase();
        switch (moneda2) {
            case "libras":
                String resultadolib = lib(euro);
                System.out.println(resultadolib);
                break;
            case "dolares":
                String resultadodol = dol(euro);
                System.out.println(resultadodol);
                break;
            case "yenes":
                String resultadoyen = yen(euro);
                System.out.println(resultadoyen);
                break;
           
        }
        
    }
    public static String lib (int euro) {
        
        double libra = euro * 0.86;
        String valor = ("Son £" + libra + " libras");
        
        return valor;
        
    }
    public static String dol (int euro) {
        
        double dolar = euro * 1.28611;
        String valor = ("Son $" + dolar + " dolares");
        
        return valor;
        
    }
    public static String yen (int euro) {
        
        double yenes = euro * 129.852;
        String valor = ("Son ¥" + yenes + " yenes");
        
        return valor;
        
    }
}
