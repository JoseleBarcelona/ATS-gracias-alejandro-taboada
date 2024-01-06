package ProgOrienObjt.SobrescrituraMetodos;

public class Perro extends FormasDeComer{
    @Override  //Esto significa sobrescritura de método
    public void comer() {
        System.out.println("Como en un platito en el suelo");
    }
}
