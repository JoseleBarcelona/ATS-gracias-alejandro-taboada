package Condicionales.Ejercicios;

import javax.swing.*;

/*
Hacer un programa que lea un carácter por teclado y compruebe si es
una letra mayúscula.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra tecleada es mayúscula: ");
        }
        else {
            JOptionPane.showMessageDialog(null, "La letra tecleada es minúscula: ");
        }

    }
}
