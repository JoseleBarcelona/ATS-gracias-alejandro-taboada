package ProgOrienObjt.Polimorfismo;

public class VehiculoFurgoneta extends VehiculoClasePadre{
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "Matrícula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga: "+carga+"kg";

    }
}
