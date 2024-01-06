package ProgOrienObjt.poo8Ejercicios.Ejercicio3;

/*
Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los atributos
necesarios que se requieren, proporcione métodos de consulta, un método constructor e implemente
métodos para calcular el perímetro y el área de un triángulo, además de implementar
un método a partir de un arreglo de triángulos, devuelva el área del triángulo
de mayor superficie.
 */
public class TrianguloIsosceles {
    private double lado;
    private double base;

    public TrianguloIsosceles(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }
    public double obtenerPerimetro(){
        double perimetro = 2*lado + base;
        return perimetro;

    }
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado) - ((base*base)/4)))/2;
        return area;
    }
}
