package Bucles.Ejercicios;

import javax.swing.*;

/*
Una empresa que se dedica a la venta de desinfectantes, necesita un programa para
gestionar facturas. En cada factura figura:
  1. El código del artículo
  2. La cantidad vendida en litros
  3. El precio por litro
  Se pide de 5 facturas introducidas:
  A. Facturación total
  B. Cantidad de litros vendidos del artículo 1
  C. Número de facturas que hayan superado los 600€
 */
public class Ejercicio9Bucles {
    public static void main(String[] args) {
        int codigo, litros, litrosarticulo1 = 0, facturasMayor600 = 0;
        float precio_litro, facturacionTotal = 0, importePorFactura;

        for (int i=1; i<=5; i++){

            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº" + i + "\nDigite el códido del artículo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº" + i + "\nDigite la cantidad vendida en litros: "));
            precio_litro = Float.parseFloat(JOptionPane.showInputDialog("Artículo Nº" + i + "\nDigite el precio por litro: "));

            importePorFactura = precio_litro * litros;
            facturacionTotal += importePorFactura;

            if (codigo == 1){
                litrosarticulo1++;
            }
            if (importePorFactura > 600){
                facturasMayor600++;
            }


        }
        System.out.println("RESUMEN DE VENTAS");
        System.out.println("Facturación total: " + facturacionTotal + "€");
        System.out.println("Cantidad de litros vendidos del artículo 1: " + litrosarticulo1 + " unds.");
        System.out.println("Número de facturas que superan los 600€: " + facturasMayor600 + " unds");




        
    }
}
