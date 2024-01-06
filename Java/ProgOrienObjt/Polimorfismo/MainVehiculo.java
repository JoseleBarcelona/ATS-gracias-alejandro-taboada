package ProgOrienObjt.Polimorfismo;

public class MainVehiculo {
    public static void main(String[] args) {
        //Creamos un array para almacenar los objetos, en lugar de crear 4 objetos.
        VehiculoClasePadre misVehiculos [] = new VehiculoClasePadre[4];  //Reservamos memoria para 4 vehículos

        misVehiculos[0] = new VehiculoClasePadre("8547HGT","Opel","Corsa");
        misVehiculos[1] = new VehiculoTurismo("3658HED","Renault", "Super5", 5);
        misVehiculos[2] = new VehiculoDeportivo("7844JUY", "Ferrari", "A89",200);
        misVehiculos[3] = new VehiculoFurgoneta("8874TRF", "Citroen", "Kangoo", 3500);

        for (VehiculoClasePadre iterador: misVehiculos){  //Creamos un bucle foreach
            System.out.println(iterador.mostrarDatos());
            System.out.println("");

        }
    }
    /*
    Código ejecutado

    Matrícula: 8547HGT
Marca: Opel
Modelo: Corsa

Matrícula: 3658HED
Marca: Renault
Modelo: Super5
Número de puertas: 5

Matrícula: 7844JUY
Marca: Ferrari
Modelo: A89
Cilindrada: 200cc

Matrícula: 8874TRF
Marca: Citroen
Modelo: Kangoo
Carga: 3500kg


Process finished with exit code 0
     */
}
