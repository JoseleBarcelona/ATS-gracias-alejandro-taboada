package ProgOrienObjt.poo3Return.Return1;

public class Operacion3 {
    public int sumar(int numero1, int numero2) {
       int suma = numero1 + numero2;
       return suma;
    }

    public int restar(int numero1, int numero2) {
       int resta = numero1 - numero2;
       return resta;
    }

    public int multiplicar(int numero1, int numero2) {
       int multiplicacion = numero1 * numero2;
       return multiplicacion;
    }

    public float dividir(float numero1, float numero2) {
       float division = numero1 / numero2;
       return division;
    }

    public void mostrarresultados(int suma, int resta, int multiplicacion, float division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es; " + division);

    }
}
