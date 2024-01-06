package OperadoresAritmeticos.Operadores;

public class OperadoresIncreDecre2 {
    public static void main(String[] args) {
        int x = 5, y;
        y = x++;//prefijo asigna a y primero el valor de x y luego hace el incremento
        //y = ++x;//sufijo incrementa a y en 1 y se lo asigna

        System.out.println(y);
        System.out.println(x);

    }
}
