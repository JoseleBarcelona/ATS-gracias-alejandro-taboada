package InterfacesGraficas.Eventos.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;

    public Ventana(){ //Creamos una ventana con la clase heredada JFrame
        this.setBounds(50,50,500,500); //Posicionamos la ventana
        this.setTitle("Eventos"); //Título de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Declaramos que se cierre el programa al cerrar la ventana
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);  //Agregamos el panel a la ventana

    }
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30,10,200,30);
        etiqueta.setFont(new Font("cooper black",0,18));
        panel.add(etiqueta);
    }
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30,50,300,30);
        panel.add(cajaTexto);

    }
    private void colocarBoton(){
        boton = new JButton("¡Pulsa aquí!");
        boton.setBounds(150,100,150,40);
        boton.setFont(new Font("arial",1,20));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50,200,300,40);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);

        //Agregamos el Evento de tipo ActionListener

        ActionListener oyenteDeAccion = new ActionListener() {
            //Implementamos la clase abstracta (Superclase) para poder sobreescribir sobre ella
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola " + cajaTexto.getText());

            }
        };  //el }; se pone porque es un método dentro de otro método.
        /*En vez de crear el objeto, también podríamos pasarle directamente la clase abstracta al botón
        de esta manera: boton.addActionListener(new ActionListener); y se nos pediría igualmente que
        implantáramos el único método abstracto que tiene la interface=(Clase abstracta) como clase
        anónima  public void actionPerformed(ActionEvent e)
         */

        boton.addActionListener(oyenteDeAccion);
        /*En el momento que pulsemos el botón, se va a ejecutar el método ActionListener, en el cual le hemos
        pasado el objeto oyenteDeAccion, en el cual hemos creado una clase anónima implementando el método
        abstracto ActionPerformed, el cual realizará lo que haya indicado dentro de ese método, en este caso
        saludo.setText("Hola " + cajaTexto.getText()); mostrar el String Hola y concatenar la obtención de
        lo que ponga en la caja de texto.
         */
    }

}
