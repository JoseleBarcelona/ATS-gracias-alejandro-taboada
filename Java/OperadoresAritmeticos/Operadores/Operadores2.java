package OperadoresAritmeticos.Operadores;

public class Operadores2 {
    public static void main(String[] args) {
        float numero = 10; //la sobreescritura ayuda a cambiar el valor de la asignación.
        numero += 5; //suma 5 y asigna el valor en numero = 10 + 5 = 15
        numero -= 5; //Resta 5 al valor almacenado numero = 15 - 5 = 10
        numero *= 5; //Multiplica el valor guardado numero = 10 * 5 = 50
        numero /= 2; // divide numero entre 2 = 50 / 2 = 25
        numero %= 7; // saca el resto de la división 25 / 7 = 3.57 (resto 4)

        //numero = numero + x; es lo mismo que numero += x; es una abreviación de Java.

        System.out.println(numero);
    }
}
