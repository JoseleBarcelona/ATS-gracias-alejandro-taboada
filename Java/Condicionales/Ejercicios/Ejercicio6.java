package Condicionales.Ejercicios;

import javax.swing.*;

/*
Construir un programa que simule el funcionamiento de una calculadora, que pueda realizar las 4 operaciones
aritméticas básicas (suma, resta, multiplicación y división) con valores numéricos enteros.
El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea
de comandos: S=suma, R=resta, M=multiplicación, D=división
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, mult, div;
        char operacion;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        operacion = JOptionPane.showInputDialog("Digite la operación que desea realizar (S,R,M,D): ").charAt(0);

        switch (operacion){
            case 's'://si no le pongo un break, sigue y evalua el siguiente, por lo que no es necesario poner la variable
            case 'S': suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
            break;

            case 'r':
            case 'R': resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
                break;

            case 'm':
            case 'M': mult = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + mult);
            break;

            case 'd':
            case 'D': div = numero1 / numero2;
            JOptionPane.showMessageDialog(null,"El resultado de la división es: " + div);
            break;
            default:JOptionPane.showMessageDialog(null,"Error, se equivocó de operación");

        }
    }
}
