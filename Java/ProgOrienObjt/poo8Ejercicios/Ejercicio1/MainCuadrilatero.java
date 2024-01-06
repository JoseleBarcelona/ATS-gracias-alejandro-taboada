package ProgOrienObjt.poo8Ejercicios.Ejercicio1;

import javax.swing.*;

/*
Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud
de sus lados. Los valores de la longitud deberán introducirse po línea de órdenes. Si es un cuadrado, solo
se proporcionará la longitud de uno de los lados al constructor.
 */
public class MainCuadrilatero {
    public static void main(String[] args) {

        Cuadrilatero c1; //Objeto c1 que todavía no ha sido creado, se creará dentro del if else.
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));

        if (lado1 == lado2){
            c1 =new Cuadrilatero(lado1); //Es un cuadrado, ya que todos sus lados son iguales.
        }
        else {
            c1 = new Cuadrilatero(lado1, lado2);
        }
        System.out.println("El perímetro es: " + c1.getperimetro());
        System.out.println("El área es: " + c1.getarea());

    }

}
