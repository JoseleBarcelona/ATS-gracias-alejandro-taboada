package Bucles.Ejercicios;

import javax.swing.*;

/*
Realizar un juego para adivinar un número aleatorio entre 0-100 y luego ir pidiendo
números indicando si es mayor o es menor, según sea mayor o menor respecto del número
digitado. El proceso terminará cuando el usuario acierte y se mostrarán el número
de intentos.
 */
public class Ejercicio3Bucles {
    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100);
        /*
        La clase Math.random siempre te da un número aleatorio entre 0 y 1, por lo que si queremos que
        nos de del 1 al 100, hay que multiplicarlo por 100 y para que no de decimales, hay que
        convertir la clase Math en un (int).
         */
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

            if (aleatorio > numero){
                System.out.println("Digite un número mayor");
            } else if (aleatorio == numero) {
                System.out.println("Has acertado");

            } else {
                System.out.println("Digite un número menor");
            }
            contador++;
        }while (numero != aleatorio);

        System.out.println("Genial!!!!, ADIVINASTE EL NÚMERO SECRETO EN " + contador + " intentos");

    }
}
