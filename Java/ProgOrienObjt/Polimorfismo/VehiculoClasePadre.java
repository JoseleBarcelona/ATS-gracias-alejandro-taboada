package ProgOrienObjt.Polimorfismo;
 /*
 POLIMORFISMO
 - En una relación de tipo herencia, un objeto de la superclase, puede almacenar un objeto
 de cualquiera de sus subclases.
 - Esto significa que la clase padre es compatible con los tipos que derivan de ella.
 Pero no al revés.
 EJEMPLO
                                         Clase vehiculoClasePadre
                                         matricula:String
                                         marca:String
                                         modelo:String
                                         mostrarDatos():String
                                                |
                   _____________________________|__________________________________
                   |                            |                                 |
         Clase VehiculoTurismo          Clase VehiculoDeportivo           Clase VehiculoFurgoneta
         numeroPuertas:int              cilindrada:int                    carga:int
         mostrarDatos():String          mostrarDatos():String             mostrarDatos():String

         VehiculoClasePadre miVehiculo = new VehiculoClasePadre("12GB","Ferrari","A8");
         VehiculoClasePadre miVehiculo2 = new VehiculoTurismo("12GB","Ferrari","A8",4);
         VehiculoClasePadre miVehiculo3 = new VehiculoDeportivo("12GB","Ferrari","A8",500cc);
         VehiculoClasePadre miVehiculo4 = new VehiculoFurgoneta("12GB","Ferrari","A8",2000kg);

  */
public class VehiculoClasePadre {
    protected String matricula;  //Ponemos protected porque va a tener clases hijas (Subclases)
    protected String marca;
    protected String modelo;

     public VehiculoClasePadre(String matricula, String marca, String modelo) {
         this.matricula = matricula;
         this.marca = marca;
         this.modelo = modelo;
     }

     public String getMatricula() {
         return matricula;
     }

     public String getMarca() {
         return marca;
     }

     public String getModelo() {
         return modelo;
     }
     public String mostrarDatos(){
         return "\nMatrícula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo;

     }
 }
