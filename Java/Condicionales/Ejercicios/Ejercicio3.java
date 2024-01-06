package Condicionales.Ejercicios;

import javax.swing.*;

/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
     - Si trabaja 40 horas o menos, se le paga 16€/hora.
     - si trabaja más de 40 horas, se le paga 16€ por cada una de las primeras 40 horas
     y 20€ por cada hora extra.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de las horas trabajadas este mes: "));

        if (horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
        }
        else {
            salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);

        }
        JOptionPane.showMessageDialog(null, "El salario total de este mes es de: " + salarioTotal + "€");

    }
}
