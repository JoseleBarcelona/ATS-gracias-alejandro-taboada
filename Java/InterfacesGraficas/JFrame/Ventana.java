package InterfacesGraficas.JFrame;

import javax.swing.JFrame;
//JFrame es una clase de Java que contiene infinidad de métodos gráficos
public class Ventana extends JFrame {  //extends heredamos la clase JFrame
    public Ventana(){  //Método constructor
        this.setSize(500,500);  //Establecemos el tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Finaliza el programa una vez cerramos la ventana
        this.setTitle("Núria es el amor de mi vida");  //Da el título a la ventana
        this.setLocation(300,300); //Por defecto la posición de la ventana es x=0, y=0
        this.setBounds(300,300,500,500);  //Sustituye a setSize y setLocation. Las engloba
        this.setLocationRelativeTo(null);  //Centra la ventana en la pantalla.

    }
}
