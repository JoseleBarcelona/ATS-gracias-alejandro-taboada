package ProgOrienObjt.poo1;

//Crear un objeto e invocar métodos de otra Clase.
public class Main {
    public static void main(String[] args) {

        Operacion op = new Operacion();

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarresultados();


    }

}
