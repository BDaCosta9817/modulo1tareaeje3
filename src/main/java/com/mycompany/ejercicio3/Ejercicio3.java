//Blanca Da Costa Gomez Carcamo
//202310010031
//Programa Verdadero o falso
package com.mycompany.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Definición de las variables
        int M = 6;
        int T = 1;
        int K = -10;

       //Validacion 
        boolean resultado1 = M > T;
        boolean resultado2 = T / K == -5;
        boolean resultado3 = (M + T == 7) || (M - T == 5);

     
        System.out.println("M > T: " + resultado1); 
        System.out.println("T / K == -5: " + resultado2); 
        System.out.println("(M + T == 7) || (M - T == 5): " + resultado3); 
    }
}