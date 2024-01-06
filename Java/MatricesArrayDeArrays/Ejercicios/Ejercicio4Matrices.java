package MatricesArrayDeArrays.Ejercicios;

public class Ejercicio4Matrices {
    public static void main(String[] args) {
        int sumaFilas, sumaColumnas;
        int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};  //Mostramos matriz

        System.out.println("\nMatriz");
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Sumamos las filas

        for (int i=0; i<matriz.length; i++){
            sumaFilas = 0;
            for (int j=0; j<matriz.length; j++){
                sumaFilas += matriz[i][j];
            }
            System.out.println("La suma de la fila ["+i+"] es: "+sumaFilas);
        }
        System.out.println(" ");

        //Sumamos la columnas

        for (int j=0; j<matriz.length; j++){
            sumaColumnas = 0;
            for (int i=0; i<matriz.length; i++){
                sumaColumnas += matriz[i][j];
            }
            System.out.println("La suma de la columna ["+j+"] es: "+sumaColumnas);
        }
        System.out.println(" ");

    }
}
/*Código ejecutado

Matriz
1 2 3
4 5 6
7 8 9

La suma de la fila [0] es: 6
La suma de la fila [1] es: 15
La suma de la fila [2] es: 24

La suma de la columna [0] es: 12
La suma de la columna [1] es: 15
La suma de la columna [2] es: 18


Process finished with exit code 0
 */