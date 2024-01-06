package ProgOrienObjt.ClasesMetodosAbstractos;

public class MainAbstracta {
    public static void main(String[] args) {

        Planta planta = new Planta();
        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        AnimalHerbivoro herbivoro = new AnimalHerbivoro();

        planta.alimentarse();
        carnivoro.alimentarse();
        herbivoro.alimentarse();
    }
}
/*
Código ejecutado

Las plantas se alimentan a través de la fotosíntesis
Los animales carnívoros, se alimentan de carne
Los animales herbívoros, se alimentan de la vegetación

Process finished with exit code 0
 */
