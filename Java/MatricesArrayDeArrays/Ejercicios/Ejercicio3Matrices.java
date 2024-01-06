package MatricesArrayDeArrays.Ejercicios;

import javax.swing.*;
import java.util.Scanner;

/*
Crear y cargar una matriz de tamaño n x m, mostrar las suma de cada fila
y la suma de cada columna.
 */
public class Ejercicio3Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas, sumaFilas, sumaColumnas;

        nFilas= Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas de la matriz: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas de la matriz: "));

        matriz = new int[nFilas][nColumnas];

        System.out.println("\nDigite la matriz\n");  //Pedimos las filas y columnas con un bucle for anidado
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nColumnas; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();

            }

        }
        System.out.println("\nLa matriz digitada es: \n");  //Mostramos la matriz con un bucle for anidado
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nColumnas; j++){
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println("");
        }
        //Sumamos las filas

        for (int i=0; i<nFilas; i++){
            sumaFilas = 0;  //Cada vez que haga un bucle i, sumaFilas vuelve a 0 para poder sumar la siguiente fila desde 0
            for (int j=0; j<nColumnas; j++){
                sumaFilas += matriz[i][j];

            }
            System.out.print("\nLa suma de la fila ["+i+"] es "+sumaFilas);
        }
        //Sumamos la columnas

        System.out.println(" ");
        for (int j=0; j<nColumnas; j++){
            sumaColumnas = 0;
            for (int i=0; i<nFilas; i++){
                sumaColumnas += matriz[i][j];
            }
            System.out.print("\nLa suma de la columna["+j+"] es: "+sumaColumnas);
        }
        System.out.println(" ");
    }
    /*
    Código ejecutado

    Digite la matriz

Matriz [0][0]: 1
Matriz [0][1]: 2
Matriz [0][2]: 3
Matriz [0][3]: 4
Matriz [1][0]: 1
Matriz [1][1]: 2
Matriz [1][2]: 3
Matriz [1][3]: 4

La matriz digitada es:

1 2 3 4
1 2 3 4

La suma de la fila [0] es 10
La suma de la fila [1] es 10

La suma de la columna[0] es: 2
La suma de la columna[1] es: 4
La suma de la columna[2] es: 6
La suma de la columna[3] es: 8

Process finished with exit code 0
     */
}
