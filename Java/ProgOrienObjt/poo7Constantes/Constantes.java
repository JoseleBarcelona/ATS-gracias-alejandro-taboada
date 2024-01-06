package ProgOrienObjt.poo7Constantes;

public class Constantes {
    /*
    Final crea una constante de un atributo que jamás se podrá cambiar a lo largo del programa
    (El nombre de una persona no suele cambiar a lo largo del tiempo).
     */
    private final String nombre;
    private int edad;

    //Contructor

    public Constantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("el nombre es : " + nombre);
        System.out.println("La edad es: " + edad);
    }
    /*
    Usamos el método getter and setter para cambiar la edad que cambia a lo largo de los años
    Generate getter and setter no nos permite crearlo para el nombre, ya que el atributo nombre
    tiene la constante implantada (Final).
     */
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
