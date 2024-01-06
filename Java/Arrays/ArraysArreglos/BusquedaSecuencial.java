package Arrays.ArraysArreglos;

/*
BÚSQUEDA SECUENCIAL
arreglo[]= {3, 1, 2, 5, 4};
 */

import javax.swing.*;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int[] arreglo = {4, 1, 5, 2, 3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));

        //Búsqueda secuencial necesitamos recorrer el arreglo
        int i=0;  //iterador
        while (i<5 && band == false){  //mientras que el valor sea menor al número de elementos
                                       //y el boolean siga siendo false, el bujcle se repetirá.
            if (arreglo[i] == dato){
                band = true;
            }
            i++;  //avanzamos una posición en el arreglo
        }
        if (band == false){
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
        }else {
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición" + (i-1));
            //i-1 porque se ha encontrado el dato en la posición anterior a la siguiente vuelta del bucle
        }
    }
}
