/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los
socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo
del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package Extras;

import java.util.Scanner;
public class EjerExtra5_Costo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar tipo de socio (A, B, C) ");
        String letra = leer.next();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
       
        switch (letra){
            
            case "A":
                System.out.println("El costo real del tratamiento es de $" + (costo*0.50));
                break;
            case "B":
                System.out.println("El costo real del tratamiento es de $" + (costo-costo*0.35));
            break;
            case "C":
                System.out.println("El costo real del tatamiento es de $" + costo);
                break;
            
        }
        
    }
    
}
/*
package extras;

import java.util.Scanner;

public class Extra5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar tipo de socio (A, B, C) ");
        String letra = leer.next();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        switch (letra){
            
            case "A":
                System.out.println("El costo real del tratamiento es de $" + (costo*0.50));
                break;
            case "B":
                System.out.println("El costo real del tratamiento es de $" + (costo*1.35));
            break;
            case "C":
                System.out.println("El costo real del tatamiento es de $" + costo);
                break;
            
        }
        
    }
    
}
*/