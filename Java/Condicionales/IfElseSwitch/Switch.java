package Condicionales.IfElseSwitch;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1 y 5: "));
        switch (dato){
            case 1: JOptionPane.showMessageDialog(null,"has elegido el 1");
            break;
            case 2: JOptionPane.showMessageDialog(null, "Has elegido el 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "Has elegido el 30");
            break;
            case 4: JOptionPane.showMessageDialog(null, "Has elegido el 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "Has elegido el 5");
            break;
            default: JOptionPane.showMessageDialog(null, "Pay attention to the key you type and try again");

        }
    }
}
