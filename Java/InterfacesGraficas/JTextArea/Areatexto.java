package InterfacesGraficas.JTextArea;

import javax.swing.*;
import java.awt.*;

public class Areatexto extends JFrame {
    public JPanel panel;
    public Areatexto(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("PROGRAMACIÓN JOSELE BARCELONA");
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarAreasTexto();
    }
    private void colocarPaneles(){  //Creamos un panel
        panel = new JPanel(); //Aquí instanciamos el panel
        getContentPane().add(panel);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
    }
    private void colocarAreasTexto(){
        JTextArea areaTexto = new JTextArea();
        panel.add(areaTexto);
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Hola");
        areaTexto.append(" qúe haces!"); //Agrega texto al ya existente
        areaTexto.setEditable(true); //Si ponemos false, no permite ni editar, ni escribir en el área de texto.

        System.out.println("El texto del área es: "+areaTexto.getText()); //Vemos en consola lo escrito en el área de texto
    }
}
