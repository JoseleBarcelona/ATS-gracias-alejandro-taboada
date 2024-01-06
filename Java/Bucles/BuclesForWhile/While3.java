package Bucles.BuclesForWhile;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int operador;
        System.out.println("Digite la cantidad de números que quiere que se muestren en pantalla: ");
        operador = entrada.nextInt();

        while (i<=operador){
            System.out.println(i);
            i+=5;
        }
    }
}
