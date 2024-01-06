package Arrays.ArraysArreglos;

//ORDENAMIENTO POR INSERCIÓN
// Si número de la izquierda > número actual = se intercambian

public class Ordenamientos2 {
    public static void main(String[] args) {

        int aux, posicion;
        int[] arreglo = new int[5];

        arreglo[0] = 3;
        arreglo[1] = 5;
        arreglo[2] = 1;
        arreglo[3] = 2;
        arreglo[4] = 4;

        for (int i=0; i<5; i++){
            posicion = i;
            aux = arreglo[i];

            while ((posicion>0  && arreglo[posicion-1] > aux)){
                arreglo[posicion] = arreglo[posicion-1];
                posicion--;

            }
            arreglo[posicion] = aux;
        }
        System.out.println("Orden ascendente: ");
        for (int i=0; i<5; i++){
            System.out.println(arreglo[i]);

        }
        System.out.println("Orden descendente: ");
        for (int i=4; i>=0; i--){
            System.out.println(arreglo[i]);

        }
    }
}
/*
Código ejecutado

Orden ascendente:
1
2
3
4
5
Orden descendente:
5
4
3
2
1

Process finished with exit code 0
 */
