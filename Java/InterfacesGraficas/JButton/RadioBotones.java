package InterfacesGraficas.JButton;

import javax.swing.*;
import java.awt.*;

public class RadioBotones extends JFrame {
    public JPanel panel;
    public RadioBotones(){  //Creamos la ventana JFrame (Método constructor)
        this.setSize(500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("PROGRAMACIÓN JOSELE BARCELONA");
        iniciarComponentes();
    }
    private void iniciarComponentes(){  //Iniciamos métodos
        colocarPaneles();
        colocarRadioBotones();

    }
    private void colocarPaneles(){  //Creamos un panel
        panel = new JPanel(); //Aquí instanciamos el panel
        getContentPane().add(panel);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
    }
    private void colocarRadioBotones(){  //Creamos radiobotones

        //JRadioButton te permite seleccionar varias opciones a la vez

        JRadioButton radioboton1 = new JRadioButton("Opción 1",true); //true se inicia marcando la opción
        panel.add(radioboton1);
        radioboton1.setBounds(20,20,100,40);

        JRadioButton radioboton2 = new JRadioButton("Opción 2",false);  //falso se inicia sin marcar la opción
        panel.add(radioboton2);
        radioboton2.setBounds(20,70,100,40);

        JRadioButton radioboton3 = new JRadioButton("Opción 3",false);
        panel.add(radioboton3);
        radioboton3.setBounds(20,120,100,40);

        //ButtonGroup te permite seleccionar una única opción

        ButtonGroup grupoBotones = new ButtonGroup(); //Si lo comentamos veremos que se pueden elegir las 3 opciones a la vez
        grupoBotones.add(radioboton1);
        grupoBotones.add(radioboton2);
        grupoBotones.add(radioboton3);

    }


}
