package InOutConsola;

import javax.swing.*;

public class InOutJOPtionPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        float decimal2;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero"));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        decimal2 = Float.parseFloat(JOptionPane.showInputDialog("Digita otro decimal: "));

        JOptionPane.showMessageDialog(null,"La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El primer decimal es: " + decimal);
        JOptionPane.showMessageDialog(null, "El segundo decimal es: " + decimal2);


    }
}
