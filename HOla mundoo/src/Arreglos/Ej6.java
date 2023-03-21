/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] [] MatrizA = new int [3] [3];
     int error;
        do {
        error = 0;
        System.out.println("Ingrese 9 números entre 1 y 9:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizA[i][j]= leer.nextInt();
                if ((MatrizA[i][j] > 9) || (MatrizA[i][j] < 1)) {
                    error ++;
                }
                    }
        }
        if (error>0){
            System.out.println("Usted ingresó mal " + error + " número/s.");
            
        }
        } while (error > 0);
                
        System.out.println("Su cubo se ve así:");
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((MatrizA[i][j]) + " ");
                }
                    System.out.println("");
                    }
        
        int s1, s2, s3, s4, s5, s6, s7, s8;
        s1=0;
        s2=0;
        s3=0;
        s4=0;
        s5=0;
        s6=0;
        s7=0;
        s8=0;
                
                        
                for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0){
                    s1= s1+MatrizA[i][j];
                }
                if (i==1){
                    s2= s2+MatrizA[i][j];
                }
                if (i==2){
                    s3= s3+MatrizA[i][j];
                }
                if (i==j){ //esto suma la diagonal principal
                    s4= s4+MatrizA[i][j];
                }
                if (j==0){
                    s5= s5+MatrizA[i][j];
                }
                if (j==1){
                    s6= s6+MatrizA[i][j];
                }
                if (j==2){
                    s7= s7+MatrizA[i][j];
                }
                if (i+j==2){ //Esta formula suma la matriz inversa, la suma de i y j es = a la cantidad de filas o columnas -1
                    s8= s8+MatrizA[i][j];
                }
                }
                    
                    }
                if ((s1==s2) && (s3==s4) && (s5==s6) && (s7==s8) && (s8==s4)){
                    System.out.println("Felicidades, este cubo tiene mucha mágia :D");
                }else{
                            System.out.println("A tu cubo le falta mágia :(");
                            }
                
                }
        }
    

