package ProgOrienObjt.poo2;

public class Operacion2 {
        //Atributos
        int suma;
        int resta;
        int multiplicacion;
        float division;

        public void sumar(int numero1, int numero2) {//las variables dentro de un método se llaman parámetros.
            suma = numero1 + numero2;//Método para sumar ambos números
        }

        public void restar(int numero1, int numero2) {
            resta = numero1 - numero2;//Método para restar ambos números
        }

        public void multiplicar(int numero1, int numero2) {
            multiplicacion = numero1 * numero2;//Método para multiplicar ambos números
        }

        public void dividir(float numero1, float numero2) {
            division = numero1 / numero2;//Método para dividir ambos números
        }

        public void mostrarresultados() {
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicación es: " + multiplicacion);
            System.out.println("La división es; " + division);

        }

    public static class Return {

    }
}


