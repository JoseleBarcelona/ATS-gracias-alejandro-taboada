package Bucles.Ejercicios;
//Diseñar un programa que muestre el producto de los 10 primeros números impares.
public class Ejercicio6Bucles {
    public static void main(String[] args) {
        long producto = 1;//Inciamos en 1, porque cualquier multiplicación por 0 da 0.

        for (int i=1; i<=20; i+=2){
            /*
            i>20 se basa en que los pares o impares van de dos en dos y el último impar de 10 en 10
            es el 19.
            i+=2 hace que se sumen de dos en dos,si empieza i=1 el siguiente sería 3, 5, 7....
             */
            producto *= i;

        }
        System.out.println(producto);
    }
}
