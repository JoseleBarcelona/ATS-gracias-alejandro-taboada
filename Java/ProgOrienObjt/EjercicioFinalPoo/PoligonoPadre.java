package ProgOrienObjt.EjercicioFinalPoo;
/*
Hacer un programa para calcular el área de polígonos (triángulos y rectángulos)
el programa debe ser capaz de almacenar en un array N triángulos y rectángulos y
al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:

- Una superclase llamada Polígono
- Una subclase llamada Rectángulo
- Una subclase llamada Triángulo

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
public abstract class PoligonoPadre {  //Clase abstracta
    protected int numeroLados;   //La clase padre (superclase) siempre es protected al tener subclases (Hijas)

    public PoligonoPadre(int numeroLados) {   //Método constructor para inicializar los atributos
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {  //Método getter para obtener los datos
        return numeroLados;
    }

    @Override
    public String toString() {  //El método toString en java es exactamente igual al método mostrarDatos()
        return "Número de lados=" + numeroLados;

    }
    //Declaramos el método área como abstracto
    public abstract double area();

}
