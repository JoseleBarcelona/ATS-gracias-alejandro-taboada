package InterfacesGraficas.JTextField;

import javax.swing.*;
import java.awt.*;

public class CajaTexto extends JFrame {
    public JPanel panel;
    public CajaTexto(){  //Creamos la ventana JFrame (Método constructor)
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("PROGRAMACIÓN JOSELE BARCELONA");
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarCajasTexto();

    }
    private void colocarPaneles(){  //Creamos un panel
        panel = new JPanel(); //Aquí instanciamos el panel
        getContentPane().add(panel); //con getContentPane() agregamos el panel al contenedor de JFrame
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
    }
    private void colocarCajasTexto(){ //Las cajas de texto tienen una sola fila y varias columnas.
        JTextField cajaTexto = new JTextField(); //Creamos la caja de texto dentro del panel
        panel.add(cajaTexto);
        cajaTexto.setBounds(50,50,100,30);
        cajaTexto.setText("e-mail");

        System.out.println("El campo requerido en la caja de texto es; "+cajaTexto.getText());
    }

}
