package InterfacesGraficas.Eventos.KeyListener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tecla extends JFrame {
    private JPanel panel;
    private JTextArea areaTexto;
    private JTextField cajaTexto;

    public Tecla(){ //Creamos una ventana con la clase heredada JFrame
        this.setBounds(50,50,500,500); //Posicionamos la ventana
        this.setTitle("Eventos"); //Título de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Declaramos que se cierre el programa al cerrar la ventana
        this.setVisible(true);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarAreaDeTexto();
        colocarCajaDeTexto();
        eventosDelTeclado();
    }

    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);  //Agregamos el panel a la ventana

    }
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20,30,150,30);
        panel.add(cajaTexto);
        cajaTexto.setText(" "); /*Lo agrego porque no se mostraba la caja y con las " " con espacio, se muestra*/

    }
    private void colocarAreaDeTexto(){
        areaTexto = new JTextArea();
        panel.add(areaTexto);
        areaTexto.setBounds(230,30,200,300);

        JScrollPane scrollPane = new JScrollPane(areaTexto); //Agrega una barra de scroll al area de texto.
        scrollPane.setBounds(230,30,200,300);
        panel.add(scrollPane);


    }
    private void eventosDelTeclado(){
        cajaTexto.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                areaTexto.append("keyTyped\n");
                //Ejecuta si se teclea un caracter Unicode
            }

            @Override
            public void keyPressed(KeyEvent e) {
                areaTexto.append("keyPressed\n");
                //Ejecuta si se presiona cualquier tecla

            }

            @Override
            public void keyReleased(KeyEvent e) {
                areaTexto.append("keyReleased\n");
                //Ejecuta si se suelta cualquier tecla

            }
        });
    }

}
