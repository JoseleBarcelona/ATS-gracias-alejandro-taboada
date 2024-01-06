package MatricesArrayDeArrays.Matrices;

import javax.swing.*;
import java.util.Scanner;

public class ArrayDeArrays2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [][] matriz;
        int nFilas, nColumnas;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        matriz = new int[nFilas][nColumnas];

        System.out.println("\nPedimos los elementos de cada una de las filas y guardamos");

        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nColumnas; j++){
                System.out.print("Digite la matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ");
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nColumnas; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }

    }
}
/*
Código ejecutado

Pedimos los elementos de cada una de las filas y guardamos
Digite la matriz [0][0]: 1
Digite la matriz [0][1]: 2
Digite la matriz [0][2]: 3
Digite la matriz [0][3]: 4
Digite la matriz [0][4]: 5
Digite la matriz [1][0]: 5
Digite la matriz [1][1]: 4
Digite la matriz [1][2]: 3
Digite la matriz [1][3]: 2
Digite la matriz [1][4]: 1
Digite la matriz [2][0]: 9
Digite la matriz [2][1]: 8
Digite la matriz [2][2]: 7
Digite la matriz [2][3]: 6
Digite la matriz [2][4]: 5

La matriz es:
12345
54321
98765

Process finished with exit code 0
 */