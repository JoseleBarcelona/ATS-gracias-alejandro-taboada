package ProgOrienObjt.Herencia;

/*
      CLASE HIJA O SUBCLASE
       Clase Estudiante
       -nombre: String
       -apellidos: String
       -edad: int
       -codigoEstudiante: int
       -notaFinal: float

       Estudiante(nombre, apellido, edad, codigoEstudiante, notaFinal)
       getNombre(): String
       getApellido(): String
       getEdad(): int
       mostrarDatos(): void
 */
//extends hace heredar los métodos y atributos de la clase padre PersonaHerencia en la clase hija EstudianteHerencia
public class EstudianteHerencia extends PersonaHerencia {
    private int codigoEstudiante;  //Estos dos atributos no están en la clase heredada, por lo que los añadimos
    private float notaFinal;

    //Creamos el método constructor de esta clase agregando los parámetros heredados y los nuevos añadidos.

    public EstudianteHerencia(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){

       /* La palabra super, le dice a Java que estos atributos ya están inicializados en el método constructor
       de la clase PersonaHerencia, por lo que no es necesario volverlos a inicializar*/

        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        //Estos dos nuevos atributos sí que se tienen que inicializar en este nuevo constructor.
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+
                "\nCódigo estudiante: "+codigoEstudiante+"\nNota final: "+notaFinal);

    }
}
