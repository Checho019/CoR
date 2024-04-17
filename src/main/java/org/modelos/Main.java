package org.modelos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double valorInicial = 100000;
        double nuevoValor;

        // Descuento compras superiores a 50k
        CadenaDescuento descuento1 = new CadenaDescuento(0.10, 50000);
        // Descuento navideño compras superiores 90k
        CadenaDescuento descuento2 = new CadenaDescuento(0.25, 90000);

        descuento1.setSiguienteCadenaDescuento(descuento2);
        nuevoValor = descuento1.aplicarDescuento(valorInicial);

        JOptionPane.showMessageDialog(null, "El valor con descuentos incluidos es de " + nuevoValor + " pesos");
    }
}