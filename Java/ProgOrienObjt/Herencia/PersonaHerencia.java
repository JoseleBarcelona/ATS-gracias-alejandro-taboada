package ProgOrienObjt.Herencia;
 /*
     CLASE PADRE O SUPERCLASE
       Clase Persona
       -nombre: String
       -apellidos: String
       -edad: int

       Persona(nombre, apellido, edad)
       getNombre(): String
       getApellido(): String
       getEdad(): int
  */
public class PersonaHerencia {
 private String nombre;
 private String apellido;
 private int edad;

  public PersonaHerencia(String nombre, String apellido, int edad) {
   this.nombre = nombre;
   this.apellido = apellido;
   this.edad = edad;
  }

  public String getNombre() {
   return nombre;
  }

  public String getApellido() {
   return apellido;
  }

  public int getEdad() {
   return edad;
  }
 }
