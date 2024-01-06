package ProgOrienObjt.poo1;
//Crear métodos que van a ser invocados en otra clase a través de un objeto.
import javax.swing.*;

public class Operacion {
    //Atributos
    int numero1;//Estas variables al estar fuera de un método, se les llama variables globales.
    int numero2;//Si estas variables estuvieran dentro de un método, se les llamaría variables locales.
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Método para pedirle al usuario que nos digite 2 números
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

    }
    public void sumar(){

        suma = numero1 + numero2;//Método para sumar ambos números
    }
    public void restar(){

        resta = numero1 - numero2;//Método para restar ambos números
    }
    public void multiplicar(){
        multiplicacion = numero1 * numero2;//Método para multiplicar ambos números
    }
    public void dividir(){
        division = numero1 / numero2;//Método para dividir ambos números
    }
    public void mostrarresultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " +multiplicacion);
        System.out.println("La división es; " + division);

    }

}
