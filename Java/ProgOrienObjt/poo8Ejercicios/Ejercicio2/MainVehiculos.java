package ProgOrienObjt.poo8Ejercicios.Ejercicio2;

import java.util.Scanner;

public class MainVehiculos {
    public static int indiceCocheMasBarato(Vehiculos coches[]){
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i=0; i<coches.length; i++){
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos;
        int indiceBarato;

        System.out.print("\nDigite la cantidad de vehículos: ");
        numeroVehiculos = entrada.nextInt();

        //Creamos los objetos para los coches

        Vehiculos coches[] = new Vehiculos[numeroVehiculos];
        for (int i=0; i<numeroVehiculos; i++){
            entrada.nextLine();

            System.out.println("\nDigite las características del coche "+(i+1)+": ");
            System.out.print("Introduzca la marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculos(marca, modelo, precio);
        }
        indiceBarato = indiceCocheMasBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());


    }

}
/*
Código ejecutado

Digite la cantidad de vehículos: 3

Digite las características del coche 1:
Introduzca la marca: Opel
Introduzca el modelo: Corsa
Introduzca el precio: 12.000

Digite las características del coche 2:
Introduzca la marca: Renault
Introduzca el modelo: Super5
Introduzca el precio: 15.000

Digite las características del coche 3:
Introduzca la marca: Mazda
Introduzca el modelo: Mazda 6
Introduzca el precio: 21.000

El coche más barato es:
Marca: Opel
Modelo: Corsa
Precio: €12000.0


Process finished with exit code 0
 */
