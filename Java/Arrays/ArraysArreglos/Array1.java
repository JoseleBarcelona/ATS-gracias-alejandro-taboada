package Arrays.ArraysArreglos;
// las arrays en memoria van del 0 1 2 3 4, etc. por lo que la primera posición es el 0
public class Array1 {
    public static void main(String[] args) {
        int[] numeros = new int[3];  //el array va a tener 3 elementos del mismo tipo int

        numeros[0] = 7;  //entre corchetes [0] indica el índice o lugar de memoria donde irá el valor 7
        numeros[1] = 10;
        numeros[2] = 13;
        System.out.println(numeros[1]); //imprime el valor del índice 1
        for (int i=0; i<3;i++){  //en las arrays es muy común usar el bucle for
            System.out.println("El valor que está en la posición " + i + " es= " + numeros[i]);  //imprime la condición del bucle

        }
    }
}
/*
Código ejecutado

10
El valor que está en la posición 0 es= 7
El valor que está en la posición 1 es= 10
El valor que está en la posición 2 es= 13

Process finished with exit code 0

 */