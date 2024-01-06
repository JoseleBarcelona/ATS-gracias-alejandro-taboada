package MatricesArrayDeArrays.Ejercicios;

import javax.swing.*;
import java.util.Scanner;

//Crear una matriz de tamaño n x m y decir si es simétrica o no
public class Ejercicio1Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas, nColumnas;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));

        matriz = new int[nFilas][nColumnas];
        System.out.println("Digite una matriz: ");
        for (int i=0; i<nFilas;i++){
            for (int j=0; j<nColumnas;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
         }
        if (nFilas == nColumnas){
            int i=0, j=0;
            while (i<nFilas && simetrica  == true){
                while (j<i && simetrica == true){
                    if (matriz[i][j] != matriz[j][i]){
                        simetrica = false;

                    }
                    j++;
                }
                i++;

            }
            if (simetrica==true){
                JOptionPane.showMessageDialog(null,"La matriz es simétrica");
            }
            else {
                JOptionPane.showMessageDialog(null,"La matriz no es simétrica");
            }

        }
        else {
            JOptionPane.showMessageDialog(null,"La matriz no es simétrica");

        }
    }
}
