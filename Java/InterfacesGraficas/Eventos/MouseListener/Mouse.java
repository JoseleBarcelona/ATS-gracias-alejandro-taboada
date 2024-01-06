package InterfacesGraficas.Eventos.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse extends JFrame{
    private JPanel panel;
    private JTextArea areaTexto;
    private JButton boton;

    public Mouse(){ //Creamos una ventana con la clase heredada JFrame
        this.setBounds(50,50,500,500); //Posicionamos la ventana
        this.setTitle("Eventos"); //Título de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Declaramos que se cierre el programa al cerrar la ventana
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarBoton();
        colocarAreaDeTexto();
        eventOyenteDeRaton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);  //Agregamos el panel a la ventana

    }
    private void colocarAreaDeTexto(){
        areaTexto = new JTextArea();
        panel.add(areaTexto);
        areaTexto.setBounds(20,20,300,300);
    }
    private void colocarBoton(){
        boton = new JButton("¡Pulsa aquí!");
        boton.setBounds(150,350,150,40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);

    }
    private void eventOyenteDeRaton(){
        boton.addMouseListener(new MouseListener() {
            //Con (new MouseListener(){}; implantamos las clases abstractas que tiene
            //Ponemos .append en lugar de setText, para que no se nos borre cada vez que hacemos click
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append( "mouseClicked\n");
                //Ejecuta cada vez que presionamos y soltamos el botón

            }

            @Override
            public void mousePressed(MouseEvent e) {
                areaTexto.append("mousePressed\n");
                //Ejecuta cada vez que presionamos el botón

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("mouseReleased\n");
                //Ejecuta cada vez que soltamos el botón

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("mouseEntered\n");
                //Ejecuta cada vez que pasamos el cursor sobre la superficie del botón

            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("mouseExited\n");
                //Ejecuta cada vez que salimos de la superficie del botón

            }
        });
    }

}
