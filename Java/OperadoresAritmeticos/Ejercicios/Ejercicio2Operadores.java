package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

/*
Guillermo tiene N dólares. Luis tiene la mitad que Guillermo. Juan tiene la mitad de lo que poseen Luis y
Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
public class Ejercicio2Operadores {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Digite el dinero que tiene Guillermo: ");
        guillermo = money.nextFloat();
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        total = guillermo + luis + juan;

        System.out.println("La cantidad de dinero que tienen entre los 3 es de: " + total + "$");


    }
}
