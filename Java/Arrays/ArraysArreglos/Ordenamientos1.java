package Arrays.ArraysArreglos;
//MÉTODO BURBUJA (Método para ordenar un arreglo)
//Se basa en SI NÚMERO ACTUAL ES > NÚMERO SIGUIENTE = SE INTERCAMBIAN
public class Ordenamientos1 {
    public static void main(String[] args) {
        int aux;
        int[] arreglo = new int[5];

        arreglo[0] = 3;
        arreglo[1] = 5;
        arreglo[2] = 1;
        arreglo[3] = 2;
        arreglo[4] = 4;

        //El método burbuja se hace con un "for" anidado dentro de otro "for"" para poder usar dos iteradores.

        for (int i=0; i<4; i++){  //Se pone <4 porque para ordenar 5 números, solo hay que dar 4 vueltas al bucle
            for (int j=0; j<4; j++){
                if (arreglo[j] > arreglo[j+1]){  //si número actual es > número siguiente
                    aux = arreglo[j];  //número auxiliar = número actual
                    arreglo[j] = arreglo[j+1];  //al número actual le agregamos el valor del número siguiente
                    arreglo[j+1] = aux;  //El número siguiente va a adquirir el valor de aux

                    //Con esto queda la sintaxis necesaria para ordenar el arreglo con el método burbuja
                }
            }

        }
        //Mostrar el arreglo ordenado en forma creciente
        System.out.println("Arreglo ordenado en forma creciente: ");
        for (int i=0; i<5; i++){
            System.out.println(arreglo[i]);

        }
        //Mostrar el arreglo en forma decreciente
        System.out.println("Arreglo ordenado en forma decreciente: ");
        for (int i=4; i>=0; i--){
            System.out.println(arreglo[i]);

        }
    }
}
/*
Código ejecutado

Arreglo ordenado en forma creciente:
1
2
3
4
5
Arreglo ordenado en forma decreciente:
5
4
3
2
1

Process finished with exit code 0
 */