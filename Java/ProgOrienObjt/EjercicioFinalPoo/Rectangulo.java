package ProgOrienObjt.EjercicioFinalPoo;
/*
                                   DIAGRAMA DE FLUJO UML

                                      clase Polígono
                                      numeroLados: int
                                      área(): double
                                             |
                                             |
                         ____________________|__________________
                         |                                     |
                         |                                     |
                  Clase Rectángulo                        Clase Triángulo
                  lado1; double                           lado1: double
                  lado2: double                           lado2: double
                  toString(): String                      lado3: double
                  area(): double                          toString: String
                                                          area(): double

 */
public class Rectangulo extends PoligonoPadre{
    private double lado1; //Las clases hijas siempre son privadas para que solo se puedan instanciar en su clase
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);  //Al saber el número de lados de un rectángulo, lo enviamos directamente al constructor
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override  //Sobrescribe el método mostrarDatos() toString()
    public String toString() {
        return "Rectangulo: \n" + super.toString() + "\nlado1= " + lado1 + ", lado2= " + lado2;

        //super.toString muestra "Número de lados=" + numeroLados;
    }

    @Override
    public double area() {
        return lado1*lado2;
    }
}
