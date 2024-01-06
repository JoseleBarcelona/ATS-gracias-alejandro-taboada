package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

/*
La calificación final de un estudiante se calcula con base a sus calificaciones de cuatro aspectos
de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del
10%, 25%, 25% y 40%, hacer un programa que calcule e imprima la calificación final obtenida.
 */
public class Ejercicio3Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;

        System.out.println("Digite la nota de participación: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundo exámen: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final: ");
        examenFinal = entrada.nextFloat();

        participacion *= 0.10f;// participacion = participacion * 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;

        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        System.out.println("La nota final es de: " + notaFinal);

    }
}
