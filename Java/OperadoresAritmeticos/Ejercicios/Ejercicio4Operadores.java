package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

/*
Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
public class Ejercicio4Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;
        System.out.println("Digita el número de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168;
        dias = horasTotales % 168 / 24;
        horas = horasTotales % 24;

        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " +horas);
    }
}
