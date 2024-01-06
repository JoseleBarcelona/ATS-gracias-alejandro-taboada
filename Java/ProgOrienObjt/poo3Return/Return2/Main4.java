package ProgOrienObjt.poo3Return.Return2;

import javax.swing.*;

public class Main4 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));

        Operacion4 op4 = new Operacion4();

        System.out.println("La suma es: " + op4.sumar(n1, n2));
        System.out.println("La resta es: " + op4.restar(n1, n2));
        System.out.println("La multiplicacion es: " + op4.multiplicar(n1, n2));
        System.out.println("La division es: " + op4.dividir(n1, n2));


    }
}
