package OperadoresAritmeticos.Ejercicios;


//Hacer un programa que calcule e imprima la suma de tres calificaciones.

import java.util.Scanner;

public class Ejercicio1Operadores {
    public static void main(String[] args) {
        Scanner notafinal = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        System.out.println("Digite tres calificaciones: ");
        nota1 = notafinal.nextFloat();
        nota2 = notafinal.nextFloat();
        nota3 = notafinal.nextFloat();

        suma = nota1 + nota2 + nota3;

        System.out.println("El resultado de las tres calificaciones es: " + suma);


    }

}
