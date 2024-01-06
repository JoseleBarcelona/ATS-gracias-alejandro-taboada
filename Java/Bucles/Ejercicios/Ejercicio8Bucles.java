package Bucles.Ejercicios;

import javax.swing.*;

/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad
de alumnos mayores de 18 años y la cantidad de alumnos que midan más de 1.75m.
 */
public class Ejercicio8Bucles {
    public static void main(String[] args) {
        int edad, contador_mayor18 = 0, contador_mayor175 = 0;
        float estatura, suma_edad = 0, suma_estatura = 0, edad_media, altura_media;

        for (int i=1; i<=5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + "\nDigite su edad: "));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Alumno " + i + "\nDigite su altura: "));

            suma_edad += edad; //suma iterativa de la edad
            suma_estatura += estatura; //suma iterativa de la estatura

            if (edad > 18){ //si la edad es mayor a 18, contamos uno más para saber cuantos son con el contador++
                contador_mayor18 ++;
            }
            if (estatura > 1.75){ //si la altura es mayor a 1.75, aumentamos el contador en uno más por cada dato digitado
                contador_mayor175++;

            }

        }
        edad_media = suma_edad / 5;
        altura_media = suma_estatura / 5;

        System.out.println("La edad media de los alumnos es de: " + edad_media);
        System.out.println("La altura media de los alumnos es de: " + altura_media);
        System.out.println("Los alumnos mayores de 18 años son: " + contador_mayor18);
        System.out.println("Los alumnos que miden más de 1.75 son: " + contador_mayor175);


    }
}
