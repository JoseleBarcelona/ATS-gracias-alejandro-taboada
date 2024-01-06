package InterfacesGraficas.JButton;

import javax.swing.*;
import java.awt.*;

public class Botones extends JFrame {
    public JPanel panel; //Creamos panel de tipo public para que pueda ser instanciado desde todos los métodos
    public Botones(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("PROGRAMACIÓN JOSELE BARCELONA");
        iniciarComponentes();

    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();


    }
    private void colocarPaneles(){
        panel = new JPanel(); //Aquí instanciamos el panel
        getContentPane().add(panel);
        panel.setBackground(Color.PINK);
        panel.setLayout(null);
    }
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel();
        panel.add(etiqueta);

        etiqueta.setText("Núria Te Adoro");
        etiqueta.setBounds(45,10,450,80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.BLUE);
        etiqueta.setFont(new Font("cooper black",0,40));

        //Etiqueta de imagen

        ImageIcon imagen = new ImageIcon("ImagenesPoo/heart.jpg"); //Creamos un objeto para almacenar una imagen y así cambiar sus propiedades, tamaño, etc.
        JLabel etiqueta2 = new JLabel(); //Creamos una etiqueta
        panel.add(etiqueta2); //Agregamos la etiqueta la panel
        etiqueta2.setBounds(40,50,500,500); //Definimos tamaño de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH))); //Llamanos a la imagen almacenada en el objeto imagen
    }
    private void colocarBotones(){

        //Boton1 - botón de texto

        JButton boton1 = new JButton(); //Creamos un botón
        panel.add(boton1); //Agregamos el botón al panel
        boton1.setBounds(5,5,80,30); //Posicionamos el botón
        boton1.setText("Input"); //Establecemos un texto dentro del botón
        boton1.setMnemonic('a'); //Crea un shorcut (Atajo) utilizando alt+a para clicar el botón
        boton1.setForeground(Color.BLUE); //Establecemos el color de texto del botón
        boton1.setFont(new Font("arial",Font.BOLD,15));

        //boton2 - botón de imagen

        JButton boton2 = new JButton();
        panel.add(boton2);
        boton2.setBounds(5,40,80,30);
        boton2.setBackground(Color.CYAN);
        ImageIcon Click = new ImageIcon("ImagenesPoo/Click aqui.jpg");
        boton2.setIcon(new ImageIcon(Click.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        /*boton2.getWidth() y boton2.getHeight() hace que el tamaño de la imagen
         sea igual a los parámetros que tiene el botón (5,40,80,30)*/



    }


}
