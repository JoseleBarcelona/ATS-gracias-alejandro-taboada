package Excepciones;

import java.util.Scanner;

public class Ejemplo2Excepcion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int numero = entrada.nextInt();
    }
}
/*
Código ejecutado

Digite un número:
Jose
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:943)
	at java.base/java.util.Scanner.next(Scanner.java:1598)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
	at Excepciones.Ejemplo2Excepcion.main(Ejemplo2Excepcion.java:9)

Process finished with exit code 1
 */