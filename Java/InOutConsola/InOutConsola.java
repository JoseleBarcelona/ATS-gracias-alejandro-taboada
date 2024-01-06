package InOutConsola;

import java.util.Scanner;

public class InOutConsola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un número: ");
        numero = entrada.nextInt();
        System.out.println("El número tecleado es: " + numero);

        float decimal;
        System.out.println("Digite un decimal: ");
        decimal = entrada.nextFloat();
        System.out.println("El decimal tecleado es: " + decimal);

        double decimal1;
        System.out.println("Teclea otro decimal: ");
        decimal1 = entrada.nextDouble();
        System.out.println("El segundo decimal es: " + decimal1);


        String frase;
        System.out.println("Teclea una frase: ");
        frase = entrada.nextLine();//nextLine te guarda las palabras y los espacios.
        System.out.println("La frase es:" + frase);

        String nombre;
        System.out.println("Teclea un nombre: ");
        nombre = entrada.next();//.next te guarda la primera palabra hasta que encuentra un vacio.
        System.out.println("El nombre es; " + nombre);

        char letra;
        System.out.println("Digita una letra: ");
        letra = entrada.next().charAt(0);//si pongo 0 y escribo una palabra, me guarda el primer caracter.
        System.out.println("La letra tecleada es: " + letra);

    }
}
