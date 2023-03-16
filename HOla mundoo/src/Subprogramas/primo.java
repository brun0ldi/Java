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
public class primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = leer.nextInt();
        boolean f = div(n);
        System.out.println(f);
        
    }
    public static boolean div (int n) {
int resultado = 0;
boolean primo = true;
for (int i = 1; i <= n ; i++) {
    if (n%i==0){
        resultado = resultado + 1;
    }
}
    if (resultado==2){
        primo = true;
    }else{
        primo = false;
    }

return primo;
}
}