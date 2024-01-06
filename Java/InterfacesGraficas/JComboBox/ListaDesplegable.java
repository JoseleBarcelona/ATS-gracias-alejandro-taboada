package InterfacesGraficas.JComboBox;

import javax.swing.*;
import java.awt.*;

public class ListaDesplegable extends JFrame {
    public JPanel panel;
    public ListaDesplegable(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("PROGRAMACIÓN JOSELE BARCELONA");
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarListasDesplegables();
    }
    private void colocarPaneles(){  //Creamos un panel
        panel = new JPanel(); //Aquí instanciamos el panel
        getContentPane().add(panel);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null); //Deshabilitamos el diseño por defecto, para ir pudiendo modificarlo
    }
    private void colocarListasDesplegables(){
        String[] paises = {"España","Francia","Italia","Alemania"}; //Creamos un array

        JComboBox listaDesplegable = new JComboBox<>(paises); //Le pasamos el array a la clase JComboBox
        panel.add(listaDesplegable);  //Agregamos la lista desplegable al panel
        listaDesplegable.setBounds(20,20,100,30); //Posicionamos la lista en el panel
        listaDesplegable.addItem("Grecia"); //Añadimos un nuevo objeto a la lista
        listaDesplegable.setSelectedItem("Francia"); //Posicionamos este objeto el primero en la lista

    }
}
