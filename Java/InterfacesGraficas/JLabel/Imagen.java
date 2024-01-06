package InterfacesGraficas.JLabel;

import javax.swing.*;
import java.awt.*;

public class Imagen extends JFrame {
    public Imagen(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("JOSELE BARCELONA");
        iniciarComponentes();

    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setBackground(Color.PINK);

        JLabel etiqueta = new JLabel();
        panel.add(etiqueta);
        panel.setLayout(null);

        etiqueta.setText("Núria Te Adoro");
        etiqueta.setBounds(45,10,400,80);
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

}
