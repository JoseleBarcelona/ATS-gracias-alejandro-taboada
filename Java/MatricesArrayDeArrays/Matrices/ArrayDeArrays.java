package MatricesArrayDeArrays.Matrices;
//Array de 3 filas y 3 columnas
public class ArrayDeArrays {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j]);

            }
            System.out.println(" ");
        }
    }
}
/*
Código ejecutado

123
456
789

Process finished with exit code 0
 */