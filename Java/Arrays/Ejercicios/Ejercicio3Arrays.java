package Arrays.Ejercicios;

import java.util.Scanner;

/*
Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera
de la siguiente manera:
1. El 1º de A, el 1º de B, el 2º de A, el 2º de B,etc.

 */
public class Ejercicio3Arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10];  //Array a con 10 elementos
        b = new int[10];  //Array b con 10 elementos
        c = new int[20];  //Array c con 20 elementos (a+b)

        //Pedimos el arreglo a y lo guardamos
        System.out.println("\nDigite el arreglo a\n");
        for (int i=0; i<10; i++){
            System.out.print(" Digite la posición " + (i+1) + " para el arreglo a: ");
            a[i] = entrada.nextInt();
        }
        //Pedimos el array b y lo guardamos
        System.out.println("\nDigite el arreglo b\n");
        for (int i=0; i<10; i++){
            System.out.print(" Digite la posición " + (i+1) + " para el arreglo b: ");
            b[i] = entrada.nextInt();
        }
        //vamos a mezclar los dos arreglos en el arreglo c
        //Vamos a utilizar el iterador i para a y b
        //Vamos a utilizar el iterador j para el arreglo c
        int j=0;
        for (int i=0; i<10; i++){
            c[j] = a[i]; //1ºa, 2ºa, etc.
            j++;
            c[j] = b[i];  //1ºb, 2ºb, etc.
            j++;

        }
        System.out.println("\nlos valores del tercer array son:");
        for (int i=0; i<20; i++){
            System.out.println(c[i]);
        }
    }
}
/*
CÓDIGO EJECUTADO

Digite el arreglo a

 Digite la posición 1 para el arreglo a: 1
 Digite la posición 2 para el arreglo a: 3
 Digite la posición 3 para el arreglo a: 5
 Digite la posición 4 para el arreglo a: 7
 Digite la posición 5 para el arreglo a: 9
 Digite la posición 6 para el arreglo a: 11
 Digite la posición 7 para el arreglo a: 13
 Digite la posición 8 para el arreglo a: 15
 Digite la posición 9 para el arreglo a: 17
 Digite la posición 10 para el arreglo a: 19

Digite el arreglo b

 Digite la posición 1 para el arreglo b: 2
 Digite la posición 2 para el arreglo b: 4
 Digite la posición 3 para el arreglo b: 6
 Digite la posición 4 para el arreglo b: 8
 Digite la posición 5 para el arreglo b: 10
 Digite la posición 6 para el arreglo b: 12
 Digite la posición 7 para el arreglo b: 14
 Digite la posición 8 para el arreglo b: 16
 Digite la posición 9 para el arreglo b: 18
 Digite la posición 10 para el arreglo b: 20

los valores del tercer array son:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

Process finished with exit code 0
 */