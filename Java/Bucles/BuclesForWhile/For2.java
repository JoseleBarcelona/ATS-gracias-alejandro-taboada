package Bucles.BuclesForWhile;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;

        System.out.println("Digite una cantidad: ");
        contador = entrada.nextInt();

        for (int i=0; i<=contador; i+=10){
            System.out.println(i);
        }
    }
}
