package ProgOrienObjt.poo4Constructor;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    //Método constructor (nunca se le pone void ni ningun valor de retorno)
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        //This indica a Java cuás es el atributo, para no confundirlo con el parámetro dado en el método.

    }
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es : " + edad);

    }
}
