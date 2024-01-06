package ProgOrienObjt.poo3Return.Return1;

import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));

        Operacion3 op3 = new Operacion3();

        int suma = op3.sumar(n1, n2);
        int resta = op3.restar(n1, n2);
        int multiplicacion = op3.multiplicar(n1, n2);
        float division = op3.dividir(n1, n2);

        op3.mostrarresultados(suma, resta, multiplicacion, division);
    }
}



