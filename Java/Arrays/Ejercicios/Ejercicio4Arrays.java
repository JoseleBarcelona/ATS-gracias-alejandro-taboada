package Arrays.Ejercicios;
/*
Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos
si los números están de forma creciente, decreciente, desordenada o si todos
los números son iguales.
 */
import java.util.Scanner;

public class Ejercicio4Arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[11];
        boolean creciente = false, decreciente = false;

        System.out.println("Llenemos el arreglo");
        for (int i=0; i<10; i++){
            System.out.print((i+1) + " Digite el valor del índice " + i + " del arreglo: ");
            arreglo[i] = entrada.nextInt();
        }
        for (int i=0; i<9; i++){
            if (arreglo[i] < arreglo[i+1]){  //Creciente
                creciente = true;
            }
            if (arreglo[i] > arreglo[i+1]){  //Decreciente
                decreciente = true;

            }
        }
        if (creciente == true && decreciente == false){
            System.out.println("\nEl arreglo está en forma creciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("\nEl arreglo está en forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("\nEl arreglo está desordenado");
        } else if (creciente == false && decreciente == false) {
            System.out.println("\nTodos los números del arreglo son iguales");
        }
    }
}
/*
Código ejecutado

Llenemos el arreglo
1 Digite el valor del índice 0 del arreglo: 1
2 Digite el valor del índice 1 del arreglo: 2
3 Digite el valor del índice 2 del arreglo: 3
4 Digite el valor del índice 3 del arreglo: 4
5 Digite el valor del índice 4 del arreglo: 5
6 Digite el valor del índice 5 del arreglo: 6
7 Digite el valor del índice 6 del arreglo: 7
8 Digite el valor del índice 7 del arreglo: 8
9 Digite el valor del índice 8 del arreglo: 9
10 Digite el valor del índice 9 del arreglo: 10

El arreglo está en forma creciente

Process finished with exit code 0
 */