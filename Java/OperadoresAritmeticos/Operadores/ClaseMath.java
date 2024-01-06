package OperadoresAritmeticos.Operadores;

import javax.swing.*;
import java.util.Scanner;

public class ClaseMath {
    /*
    //Math. es una Clase de la librería de Java, en la cual encuentras múltiples
    funciones matemáticas, sólo tienes que instanciarlas.
     */
    public static void main(String[] args) {

        double raiz = Double.parseDouble(JOptionPane.showInputDialog("Digite el número que quiere sacar la raiz cuadrada: "));
        double resultado3 = Math.sqrt(raiz);
        JOptionPane.showMessageDialog(null, "El resultado de la raiz cuadrada es: " + resultado3);

        double redondeo = Double.parseDouble(JOptionPane.showInputDialog("MUestra el número a redondear: "));
        long resultado4 = Math.round(redondeo);
        JOptionPane.showMessageDialog(null, "El resultado del redondeo es: " + resultado4);

        Scanner operaciones = new Scanner(System.in);

        double raizCuadrada = Math.sqrt(9);
        System.out.println("La raiz cuadrada es: " + raizCuadrada);

        double base= 5, exponente = 2; //5 elevado a 2 es 5 * 5 = 25
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado de la potencia es " + resultado);

        double numero = 4.56; //redondeo
        long resultado1 = Math.round(numero);
        System.out.println("El redondeo del número dado es: " + resultado1);

        double numero1 = Math.random();//da un número aleatorio
        System.out.println(numero1);

        System.out.println("Digite la base y el exponente de la potencia que quiera calcular :");
        double base1= operaciones.nextDouble(), exponente1 = operaciones.nextDouble();
        double resultado2 = Math.pow(base1, exponente1);
        System.out.println("el resultado de la potencia es: " + resultado2);


    }
}
