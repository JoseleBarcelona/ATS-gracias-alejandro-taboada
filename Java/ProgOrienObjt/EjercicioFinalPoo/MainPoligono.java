package ProgOrienObjt.EjercicioFinalPoo;

import java.util.ArrayList;
import java.util.Scanner;

//Los arreglos dinámicos se crean fuera del método main, por lo que deben ser static
/*
Creamos un arreglo dinámico para almacenar polígonos con la palabra reservada ArrayList<> y entre
los símbolos <PoligonoPadre> ponemos el nombre de la clase padre, luego le damos un nombre al arreglo
"poligono" e importamos el java.util.ArrayList.
En un arreglo dinámico no hay que decirle ni pedirle al usuario cuantos elementos
va a tener, sino que a medida que agreguemos los elementos, se va a dar cuenta de cuantos
elementos tiene (Triángulos y Rectángulos).
Antes de empezar habría que pedirle al usuario cuantos polígonos quiere de que tipo y eso haría
muy grande el código, por lo que vamos a crear métodos estáticos extra para hacerlo más sencillo.
Static significa que las variables, parámetros o argumentos pasan a pertenecer a la clase y no
al método en el que esté contenido, por lo que es global y no hay que instanciar un objeto.
 */
public class MainPoligono {
    static ArrayList<PoligonoPadre> poligono = new ArrayList<PoligonoPadre>();
    static Scanner entrada = new Scanner(System.in);  //Scanner es static para que pertenezca a toda la clase
    public static void main(String[] args) {

        llenarPoligono();
        mostrarResultados();

    }
    public static void llenarPoligono(){
        int opcion;
        char respuesta;

        do {
            do{
                System.out.println("Digite qué polígono desea");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();


            }while (opcion<1 || opcion>2);

            switch (opcion){
                case 1: llenarTriangulo();
                        break;
                case 2: llenarRectangulo();
                        break;


            }
            System.out.print("\n¿Desea introducir otro polígono? (s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println(" ");

        }while (respuesta == 's' || respuesta == 'S');


    }
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.print("\nDigite el lado1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado3 del triángulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);  //Creamos un objeto dentro de este método
        poligono.add(triangulo);  //Almacenamos el objeto triangulo dentro del objeto padre poligono
    }
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.print("\nDigite el lado1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del rectángulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }
    public static void mostrarResultados(){
        for (PoligonoPadre iterador: poligono){
            System.out.println(iterador.toString());
            System.out.println("Area= :" + iterador.area());
            System.out.println(" ");
        }
    }
}
/*
Código ejecutado

1. Triángulo
2. Rectángulo
Opción: 1

Digite el lado1 del triángulo: 5
Digite el lado2 del triángulo: 6
Digite el lado3 del triángulo: 7

¿Desea introducir otro polígono? (s/n): s

Digite qué polígono desea
1. Triángulo
2. Rectángulo
Opción: 1

Digite el lado1 del triángulo: 2
Digite el lado2 del triángulo: 2
Digite el lado3 del triángulo: 2

¿Desea introducir otro polígono? (s/n): s

Digite qué polígono desea
1. Triángulo
2. Rectángulo
Opción: 2

Digite el lado1 del rectángulo: 2
Digite el lado2 del rectángulo: 4

¿Desea introducir otro polígono? (s/n): s

Digite qué polígono desea
1. Triángulo
2. Rectángulo
Opción: 2

Digite el lado1 del rectángulo: 4
Digite el lado2 del rectángulo: 9

¿Desea introducir otro polígono? (s/n): n

Triangulo:
Número de lados=3
lado1= 5.0, lado2= 6.0, lado3= 7.0
Area= :14.696938456699069

Triangulo:
Número de lados=3
lado1= 2.0, lado2= 2.0, lado3= 2.0
Area= :1.7320508075688772

Rectangulo:
Número de lados=2
lado1= 2.0, lado2= 4.0
Area= :8.0

Rectangulo:
Número de lados=2
lado1= 4.0, lado2= 9.0
Area= :36.0


Process finished with exit code 0

 */
