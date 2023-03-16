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
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int a = leer.nextInt();
        int b = leer.nextInt();
        String f = multiplo (a, b);
        
        System.out.println(f);
    }
    public static String multiplo(int a, int b) {
String resultado = "";
if (a%b==0){
    resultado = "Es múltiplo";
    
}else{
    resultado = "No es múltiplo";
}
   

return resultado;
}
}


