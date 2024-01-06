package Arrays.Ejercicios;
/*
Crear un array de 10 números enteros y que vaya desplazando una posición
creciente, en la cual el primer número pase a la posición del segundo, el
segundo pase a ocupar la posición del tercero y así sucesivamente, hasta que
el último número pase a la primera posición.
 */
public class Ejercicio5Arrays {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ultimo;

        ultimo = arreglo[9];  //el último valor (índice 9), lo guardamos en una variable para no perderlo
        for (int i=8; i>=0; i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo;  //Aquí recuperamos el último valor y lo pasamos a la posición 0
        System.out.println("El nuevo arreglo es: ");
        for (int i=0; i<10; i++){
            System.out.println(i+" Número: "+ arreglo[i]);
        }
    }
}
/*Código ejecutado

El nuevo arreglo es:
0 Número: 10
1 Número: 1
2 Número: 2
3 Número: 3
4 Número: 4
5 Número: 5
6 Número: 6
7 Número: 7
8 Número: 8
9 Número: 9
 */