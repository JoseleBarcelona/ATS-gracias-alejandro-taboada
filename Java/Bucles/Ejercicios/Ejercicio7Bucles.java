package Bucles.Ejercicios;

import javax.swing.*;
import java.util.jar.JarOutputStream;

/*
Pedir 10 número. Mostrar la media de los números positivos, la media de los
números negativos y la cantidad de ceros-
 */
public class Ejercicio7Bucles {
    public static void main(String[] args) {
        int numero, suma_positivos = 0, conteo_positivos = 0, suma_negativos = 0, conteo_negativos = 0, conteo_ceros = 0;
        float media_positivos, media_negativos;

        for (int i=1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número positivo o negativo: "));

            if (numero == 0){ //Si el número es cero.
                conteo_ceros++;//Aumentamos en 1 el conteo de ceros.

            } else if (numero>0) { //Si el número es positivo:
                suma_positivos+= numero; //Suma iterativa de positivos.
                conteo_positivos++;
            } else { //Si el número es negativo.
                suma_negativos+= numero;
                conteo_negativos++;

            }
        }
        //Tratamos con los positivos
        if (conteo_positivos == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }else {
            media_positivos = (float) suma_positivos / conteo_positivos;
            System.out.println("La media de los números positivos es de: " + media_positivos);

            //Tratamos con los negativos

        }if (conteo_negativos == 0){
            System.out.println("No se puede sacar la media de los negativos: ");

        }else {
            media_negativos = (float) suma_negativos / conteo_negativos;
            System.out.println("La media de los números negativos es de: " + media_negativos);
        }
        System.out.println("La cantidad de ceros digitados de de: " + conteo_ceros);
    }
}
