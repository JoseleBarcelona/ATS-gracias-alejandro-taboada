package Bucles.Ejercicios;

import javax.swing.*;

/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
un número negativo.
 */
public class Ejercicio1Bucles {
    public static void main(String[] args) {
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));


        while (numero>=0){
            cuadrado = (int) Math.pow(numero, 2);

            JOptionPane.showMessageDialog(null, "El número " + numero + " elevado al cuadrado es: " + cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }

    }
}
