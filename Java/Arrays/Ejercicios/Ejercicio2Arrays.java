package Arrays.Ejercicios;

import java.util.Scanner;

/*
Leer 5 números por teclado, almacenarlos en un array y a continuación
realizar la media de los números positivos, la media de los números
negativos y contar el número de ceros.
 */
public class Ejercicio2Arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        float suma_positivos=0, suma_negativos=0, media_positivos, media_negativos;
        int conteo_positivos=0, conteo_negativos=0, conteo_ceros=0;

        System.out.print("\nGuardando los números en el arreglo\n");
        for (int i=0; i<numeros.length; i++){
            System.out.print("Digite un número: ");
            numeros[i] = entrada.nextFloat();

            if (numeros[i] == 0){
                conteo_ceros++;
            } else if (numeros[i] > 0) {
                suma_positivos = suma_positivos + numeros[i];
                conteo_positivos++;

            }else {
                suma_negativos += numeros[i];
                conteo_negativos++;
            }

        }
        //Media de los números positivos
        if (conteo_positivos == 0){
            System.out.println("No se puede la sacar la media de los números positivos");

        }else {
            media_positivos = suma_positivos / conteo_positivos;
            System.out.println("La media de los números positivos es: " + media_positivos);
        }
        if (conteo_negativos == 0){
            System.out.println("No se puede la sacar la media de los números negativos");
        }else {
            media_negativos = suma_negativos / conteo_negativos;
            System.out.println("La media de los números negativos es: " + media_negativos);
        }
        System.out.println("La cantidad de ceros es de: " + conteo_ceros);
    }
}
/*
CÓDIGO EJECUTADO

Guardando los números en el arreglo
Digite un número: 8
Digite un número: 9
Digite un número: 0
Digite un número: -5
Digite un número: -6
La media de los números positivos es: 8.5
La media de los números negativos es: -5.5
La cantidad de ceros es de: 1

Process finished with exit code 0
 */