package Condicionales.IfElseSwitch;

import javax.swing.*;
    /*Las sentencia if:
          if(condicion){
              instrución;
                  }
          else{
              instruccion2;
                  }*/
public class IfElse {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        if (numero == dato){ // == Operador de igualdad
            JOptionPane.showMessageDialog(null, "El número es 5");

        }
        else{
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");
        }
        if (numero != dato){ // != Operador de desigualdad
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");

        }
        else{
            JOptionPane.showMessageDialog(null, "El número es 5");
        }
        if (numero >= dato){ //  Operador de mayor o igual que
            JOptionPane.showMessageDialog(null, "El número es mayor o igual a 5");

        }
        else{
            JOptionPane.showMessageDialog(null, "El número es menor que 5");
        }
        /*
        OPERADORES:

        == : Igualdad
        != : diferencia
        > :  Mayor que
        >=:  Mayor o igual que
        <:   Menor que
        <=   Menor o igual que
         */


    }
}
