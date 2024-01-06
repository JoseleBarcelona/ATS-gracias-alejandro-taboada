package Condicionales.Ejercicios;

import javax.swing.*;

/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
Suponiendo que todos los meses son de 30 días.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int dia, mes, año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if ((dia>=1) && (dia<=30)){
            JOptionPane.showMessageDialog(null, "El día es correcto");
        }
        else {
            JOptionPane.showMessageDialog(null, "El día es incorrecto");
        }
        if ((mes>=1) && (mes<=12)){
            JOptionPane.showMessageDialog(null,"El mes es correcto");
        }
        else {
            JOptionPane.showMessageDialog(null,"El mes es incorrecto");
        }
        if (año!=0){
            JOptionPane.showMessageDialog(null, "El año es correcto");
        }
        else {
            JOptionPane.showMessageDialog(null, "El año es incorrecto");
        }
    }
}
