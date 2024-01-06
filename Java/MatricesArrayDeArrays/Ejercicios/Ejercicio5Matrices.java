package MatricesArrayDeArrays.Ejercicios;
/*
Crear una matriz tipo "marco" de tamaño 5*5, en los cuales todos sus elementos
perimetrales tienen que ser 1 y los centrales 0.

   1 1 1 1 1
   1 0 0 0 1
   1 0 0 0 1
   1 0 0 0 1
   1 1 1 1 1
 */
public class Ejercicio5Matrices {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        //Rellenando la matriz
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==0 || i==4){        //Esto te pone toda la fila 0 y 4 a 1
                    matriz[i][j] = 1;
                }
                else if (j==0 || j==4) {  //Esto te pone toda la columna 0 y 4 a 1
                    matriz[i][j] = 1;

                }
                else {
                    matriz[i][j] = 0;    //Esto te pone el resto de filas y columnas a 0
                }
            }
        }
        System.out.print("\nLa matriz es: \n\n");
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
/*Código ejecutado

La matriz es:

1 1 1 1 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 1 1 1 1


Process finished with exit code 0
 */
