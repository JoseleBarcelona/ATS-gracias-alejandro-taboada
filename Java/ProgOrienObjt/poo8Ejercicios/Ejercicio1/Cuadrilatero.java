package ProgOrienObjt.poo8Ejercicios.Ejercicio1;

public class Cuadrilatero {

    //Atributos
    private float lado1;
    private float lado2;
    //Métodos constructores


    public Cuadrilatero(float lado1, float lado2) { //Para un rectángulo (lados diferentes).
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) { //Para un cuadrado (todos los lados iguales).
        this.lado1 = this.lado2 = lado1;
        //Al ser un cuadrado, con el this, tengo que igualar el valor de los dos atributos.


    }
    //Método Getter

    public float getperimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getarea() {
        float area = (lado1 * lado2);
        return area;
    }
}
