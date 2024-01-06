package Arrays.ArraysArreglos;

import javax.swing.*;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del elementos del array: "));

        char[] letras = new char[nElementos];

        System.out.println("\nIndique los carácteres del array\n");

        for (int i=0; i<nElementos; i++){
            System.out.print((i+1) + " Digite un carácter: ");
            letras[i] = entrada.next().charAt(0);

        }
        System.out.println("\nLos carácteres del array son:");
        for (int i=0; i<nElementos; i++){
            System.out.print(letras[i]);
        }
    }
}
/*
Código ejecutado

Indique los carácteres del array

1 Digite un carácter: N
2 Digite un carácter: ú
3 Digite un carácter: r
4 Digite un carácter: i
5 Digite un carácter: a

Los carácteres del array son:
Núria
Process finished with exit code 0
 */