package ClasesInternasAnonimas.EjemploBasico;

public class MainSaludos {
    public static void main(String[] args) {
        Saludos saludo = new Saludos(){
            @Override
            public void Bienvenido() { //Clase interna anónima
                System.out.println("Método sobrescrito");
            }
        };
        Saludos saludo2 = new Saludos();
        saludo.Bienvenido();
        saludo2.Bienvenido();
    }
}
