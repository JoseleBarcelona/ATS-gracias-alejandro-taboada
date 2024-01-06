package Bucles.Ejercicios;

//Leer números hasta que se introduzca un 0 e indicar si son pares o impares

import javax.swing.*;

public class Ejercicio2Bucles {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        while (numero != 0){ //mientras el número sea distinto de 0.
            /*
            Los números pares son aquellos que se pueden dividir entre 2
            y obteniendo como resultado un número exacto, por lo tanto, un número par no puede tener decimales
            y su resto será siempre 0.
             */
            if (numero %2 == 0){
                System.out.println("El número " + numero + " es PAR");

            }
            else {
                System.out.println("El número " + numero + " es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }

    }
}
