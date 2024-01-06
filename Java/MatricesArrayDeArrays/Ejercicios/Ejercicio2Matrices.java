package MatricesArrayDeArrays.Ejercicios;

//Crear una matriz de tamaño 3x3, transponerla y mostrarla.

import java.util.Scanner;

public class Ejercicio2Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][]= new int[3][3];

        System.out.println("\nDigite la matriz\n");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Mostrando la matriz original

        System.out.println("\nMatriz original: \n");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        //Transponiendo la matriz

        int aux;
        for (int i=0; i<3; i++){
            for (int j=0; j<i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;

            }
        }
        System.out.println("\nMatriz transpuesta\n");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }


    }
}
/*Código ejecutado

Digite la matriz

Matriz [0][0]: 1
Matriz [0][1]: 2
Matriz [0][2]: 3
Matriz [1][0]: 4
Matriz [1][1]: 5
Matriz [1][2]: 6
Matriz [2][0]: 7
Matriz [2][1]: 8
Matriz [2][2]: 9

Matriz original:

123
456
789

Matriz transpuesta

147
258
369

Process finished with exit code 0
 */