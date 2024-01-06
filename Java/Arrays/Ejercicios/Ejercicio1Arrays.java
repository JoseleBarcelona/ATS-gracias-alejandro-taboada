package Arrays.Ejercicios;

import java.util.Scanner;

/*
Leer 5 números, guardarlos en un arreglo y mostrarlos
 en el mismo orden introducido.
 */
public class Ejercicio1Arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];

        System.out.println("\nGuardando los datos en el arreglo\n");
        for (int i=0; i<5; i++){
            System.out.print((i+1) + " Digite un número: ");
            numeros[i] = entrada.nextFloat();

        }
        System.out.println("\nNúmeros digitados en el orden introducido\n");
        for (int h= 0; h<5; h++){
            System.out.println("Los números introducidos son: " + numeros[h]);
        }
        System.out.println("\nOtro método (FOREACH) para mostrar los números\n");
        for (float j: numeros){
            System.out.println("Los mismos números son: " + j);
        }
    }
}
/*
Código ejecutado

Guardando los datos en el arreglo

1 Digite un número: 25,5
2 Digite un número: 47,6
3 Digite un número: 5
4 Digite un número: 8
5 Digite un número: 12,7

Números digitados en el orden introducido

Los números introducidos son: 25.5
Los números introducidos son: 47.6
Los números introducidos son: 5.0
Los números introducidos son: 8.0
Los números introducidos son: 12.7

Otro método (FOREACH) para mostrar los números

Los mismos números son: 25.5
Los mismos números son: 47.6
Los mismos números son: 5.0
Los mismos números son: 8.0
Los mismos números son: 12.7

Process finished with exit code 0
 */