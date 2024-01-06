package InOutConsola;

public class Constantes {
    public static void main(String[] args) {
        int numero1 = 10;
        final int numero2 = 20;
          numero1 = 15; //esta variable puede sobreescribirse
        //numero2 = 25; //esta variable no puede sobreescribirse, porque se ha declarado una constante con(final).


        System.out.println(numero1);
        System.out.println(numero2);
    }
}
