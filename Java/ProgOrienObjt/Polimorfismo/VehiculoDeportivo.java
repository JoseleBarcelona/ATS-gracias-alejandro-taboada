package ProgOrienObjt.Polimorfismo;

public class VehiculoDeportivo extends VehiculoClasePadre{
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "Matrícula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCilindrada: "+cilindrada+"cc";

    }
}
