package ProgOrienObjt.poo5Sobrecarga;

public class MainSobrecarga {
    public static void main(String[] args) {
        Persona2 p2 = new Persona2("Núria",51);
        p2.correr();
        Persona2 p3 = new Persona2("52460411R");
        p3.correr(100);
    }
}
