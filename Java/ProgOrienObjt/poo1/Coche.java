package ProgOrienObjt.poo1;
//Aprender a crear objetos e imprimir con un método main, dentro de la misma clase.
public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    //Método main
    public static void main(String[] args) {
        Coche coche1 = new Coche();//Creación de un objeto

        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche1 es: "+coche1.km+"km");

        Coche coche2 = new Coche();//Creación de un segundo objeto

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        //Si pongo \n, creará un espacio en la impresión por consola
        System.out.println("\nEl color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche2 es: "+coche2.km);


    }
}
