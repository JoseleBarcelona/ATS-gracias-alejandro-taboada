package Condicionales.Ejercicios;

import javax.swing.*;

/*
Hacer un programa que simule un cajero automático con un saldo inicial de 1000€.
El menú de opciones será el siguiente:
   1. Ingresar dinero en la cuenta
   2. Retirar dinero de la cuenta
   3. Salir
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, extraccion, saldo_actual;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático de 'LA CAIXA':\n"
        + " 1. Ingresar dinero en la cuenta\n"
        + " 2. Retirar dinero de la cuenta\n"
        + " 3. Salir "));

        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a ingresar: "));
            saldo_actual = saldo_inicial + ingreso;
            JOptionPane.showMessageDialog(null,"El saldo actual en cuenta es de: " + saldo_actual);
            break;

            case 2: extraccion = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a extraer: "));
            if (extraccion > saldo_inicial){
                JOptionPane.showMessageDialog(null,"El saldo retirado es mayor al disponible en cuenta");
            }else {
                saldo_actual = saldo_inicial - extraccion;
                JOptionPane.showMessageDialog(null, "El saldo actual en cuenta es de: " + saldo_actual);
                break;
            }

            case 3: break;

            default:JOptionPane.showMessageDialog(null,"La opción elegida es erronea, vuelva al menú");

        }

    }
}
