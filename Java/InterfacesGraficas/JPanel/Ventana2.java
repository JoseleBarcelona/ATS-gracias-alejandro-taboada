package InterfacesGraficas.JPanel;

import javax.swing.*;
import java.awt.*;

public class Ventana2 extends JFrame {
    public Ventana2() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("PRINCESA NEUS");
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(200, 200));  //Establecemos el tamaño mínimo
        this.getContentPane().setBackground(Color.CYAN); //Establecemos color de fondo en la ventana
        this.setVisible(true);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();  //Creación de un panel que irá dentro de la ventana
        this.add(panel);  //Agregamos el panel sobre la ventana
        panel.setBackground(Color.ORANGE);  //Agregamos color al panel que están dentro de la ventana

        JLabel etiqueta = new JLabel();  //Creamos una etiqueta de texto
        panel.add(etiqueta); //Agregamos la etiqueta al panel
        panel.setLayout(null); //Deshabilita el Layout(diseño) por defecto para poder usar por ejemplo el setBounds

        etiqueta.setText("Hola");  //Agregamos texto a la etiqueta
        etiqueta.setBounds(10,10,200,50);  //Establecemos posición, ancho y alto de la etiqueta
        etiqueta.setForeground(Color.BLUE); //Establecemos el color del componente (Texto de la etiqueta)
        etiqueta.setOpaque(true); //Deshabilita el fondo por defecto de la etiqueta, para poder cambiar el color
        etiqueta.setBackground(Color.PINK); //Establecemos el color de fondo de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Alineamos horizontalmente el texto dentro de la etiqueta
        etiqueta.setFont(new Font("chiller",Font.ITALIC,50)); //Establecemos la fuente pasando un objetop según la API de Java





    }
}
