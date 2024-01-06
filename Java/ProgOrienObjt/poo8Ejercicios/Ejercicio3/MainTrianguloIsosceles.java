package ProgOrienObjt.poo8Ejercicios.Ejercicio3;

import java.util.Scanner;

public class MainTrianguloIsosceles {

    public static double mayorArea(TrianguloIsosceles triangulos[]){
        double area;
        area = triangulos[0].obtenerArea();
        for (int i=0; i< triangulos.length; i++){
            if (triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.print("\nDigite el número de triángulos: ");
        nTriangulos = entrada.nextInt();

        //Creamos los objetos con un array llamando a la clase

        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[nTriangulos];

        for (int i=0; i<triangulos.length; i++){
            System.out.print("\nDigite los valores para el triángulo "+(i+1)+ ": ");
            System.out.print("Digite el lado: ");
            lado = entrada.nextFloat();
            System.out.print("Digite la base: ");
            base = entrada.nextFloat();


            triangulos[i] = new TrianguloIsosceles(lado, base);

            System.out.println("\nEl perímetro es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El área es: "+triangulos[i].obtenerArea());

        }
        System.out.println("\nEl área del triángulo de mayor superficie es: "+mayorArea(triangulos));

    }
}
/*
Código ejecutado

Digite el número de triángulos: 3

Digite los valores para el triángulo 1: Digite el lado: 2
Digite la base: 3

El perímetro es: 7.0
El área es: 1.984313483298443

Digite los valores para el triángulo 2: Digite el lado: 43,17
Digite la base: 10

El perímetro es: 96.33999633789062
El área es: 214.39733801441787

Digite los valores para el triángulo 3: Digite el lado: 4
Digite la base: 5

El perímetro es: 13.0
El área es: 7.806247497997997

El área del triángulo de mayor superficie es: 214.39733801441787

Process finished with exit code 0
 */
