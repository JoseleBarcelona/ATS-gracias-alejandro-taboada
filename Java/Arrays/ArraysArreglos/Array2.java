package Arrays.ArraysArreglos;
//Esta es otra manera de expresar una array, indicando el valor diractamente y no el número de elementos
public class Array2 {
    public static void main(String[] args) {
        int[] numeros = {8, 12, 43, 14, 5, 46, 76, 87, 89, 10};
        for (int i=0; i<numeros.length; i++){
            /*
            .lenght se usa cuando las arrays son muy largas y no queremos contar el número de elementos
            por lo que este método nos indica directamente la longitud de los elementos hasta el último
             */
            System.out.println("El índice "+ i + " tiene el valor de: "+ numeros[i]);
        }
    }
}
/*
Código ejecutado

El índice 0 tiene el valor de: 8
El índice 1 tiene el valor de: 12
El índice 2 tiene el valor de: 43
El índice 3 tiene el valor de: 14
El índice 4 tiene el valor de: 5
El índice 5 tiene el valor de: 46
El índice 6 tiene el valor de: 76
El índice 7 tiene el valor de: 87
El índice 8 tiene el valor de: 89
El índice 9 tiene el valor de: 10

Process finished with exit code 0
 */