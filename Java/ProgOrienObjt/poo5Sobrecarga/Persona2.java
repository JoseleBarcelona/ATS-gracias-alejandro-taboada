package ProgOrienObjt.poo5Sobrecarga;

public class Persona2 {
    //Atributos globales
    String nombre;
    int edad;
    //Método constructor generado automáticamente, click derecho, generate, constructor.
    String dni;


    public Persona2(String nombre, int edad) {//Constructor 1
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona2(String dni) {//Constructor2

        this.dni = dni;
    }
    public void correr(){
        System.out.println("Soy " + nombre + ",tengo " + edad + " años y estoy corriendo una maratón." );
    }
    public void correr(int km){
        System.out.println("He corrido " + km + " Kilómetros");
    }
}
