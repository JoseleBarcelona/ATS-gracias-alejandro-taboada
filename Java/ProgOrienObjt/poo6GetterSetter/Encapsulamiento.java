package ProgOrienObjt.poo6GetterSetter;

//Encapsular es ocultar atributos a otras clases, para que no sean modificados (private).
public class Encapsulamiento {
    private int edad;//private solo se puede istanciar desde esta clase.
    private String nombre;

    //Con el método getter se puede obtener el valor instanciado por un objeto de otra clase.
    public int getEdad() {
        return edad;
    }
    //Con el método setter se puede establecer el valor del atributo que se va a pedir desde otra clase
    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
