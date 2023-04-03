/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algorimito44;
import javax.swing.JOptionPane;



/**
 *
 * @author Bruno Capingote
 */
public class Algorimito44 {

    public static void main(String[] args) {
        double numero, base,logaritimo;
        String input;
        input = JOptionPane.showInputDialog(null,"Entre com o logaritimando");
        logaritimo = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null,"Entre com s base");
        base = Integer.parseInt(input);
        numero = Math.log(logaritimo)/ Math.log(base);
        JOptionPane.showMessageDialog(null,"O logaritimo de "+logaritimo+" na base"+base+","+numero);
    }
}
