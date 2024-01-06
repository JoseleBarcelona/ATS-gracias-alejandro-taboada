package Bucles.Ejercicios;

import javax.swing.*;

//Pedir números hasta que se introduzca uno negativo y calcular la media aritmética.
public class Ejercicio4Bucles {
    public static void main(String[] args) {
        int numero, elementos = 0, suma = 0;
        float media;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while (numero>=0){//Con esto indicamos los números positivos.
            suma += elementos;//suma iterativa
            elementos++;//mientras se cumpla la condición, elemento aumentará +1.

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
         if (elementos == 0){
             /*
             En caso de que el primer dígito que hagamos sea negativo, no pasará por la condición while
             y vendrá directo a la variable elementos que inicia contandpo desde 0.
              */
             System.out.println("La división entre 0 no es correcta");
         }
         else {
             media =(float) suma / elementos;
             System.out.println("La media aritmética de los número digitados es: " + media);
         }

    }
}
