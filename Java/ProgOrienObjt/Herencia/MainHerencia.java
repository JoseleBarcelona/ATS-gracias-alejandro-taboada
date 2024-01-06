package ProgOrienObjt.Herencia;

/*
La herencia es una forma de reutilización de software, en la que se crea una
nueva clase y absorbe los atributos y métodos de otra ya existente.
 */
public class MainHerencia {
    public static void main(String[] args) {
        EstudianteHerencia estudiante = new EstudianteHerencia("Núria", "Barbero", 51, 123, 9.50f);
        estudiante.mostrarDatos();
    }
    /*Código ejecutado

    Nombre: Núria
    Apellido: Barbero
    Edad: 51
    Código estudiante: 123
    Nota final: 9.5

    Process finished with exit code 0
     */
}
