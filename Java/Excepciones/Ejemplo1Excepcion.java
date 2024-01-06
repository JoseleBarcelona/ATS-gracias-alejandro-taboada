package Excepciones;
/*
¿Qué son las excepciones?

Cuando un programa Java viola las restricciones semánticas del lenguaje (se produce un error)
la máquina virtual Java comunica este hecho al programa mediante una "exception"

Muchas clases de errores pueden provocar una excepción, sede un desbordamiento de memoria, un
disco duro estropeado, un intento de dividir por 0 o intentar acceder a un vector fuera de sus límites.
Cuando esto ocurre, la máquina virtual Java crea un objeto de la clase exception.

Si surge una excepción, podemos buscar en la API de Java para que nos defina el error.
https://docs.oracle.com/javase/7/docs/api/
 */
public class Ejemplo1Excepcion {
    public static void main(String[] args) {
        int num1=5, num2=0;
        int resultado = num1/num2;
        System.out.println("El resultado es: "+ resultado);

    }
}
/*
Código ejecutado

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Excepciones.Ejemplo1Excepcion.main(Ejemplo1Excepcion.java:15)

Process finished with exit code 1
 */
