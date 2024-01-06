package ProgOrienObjt.Polimorfismo;

public class VehiculoTurismo extends VehiculoClasePadre{
    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Matrícula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNúmero de puertas: "+numeroPuertas;
    }
}
