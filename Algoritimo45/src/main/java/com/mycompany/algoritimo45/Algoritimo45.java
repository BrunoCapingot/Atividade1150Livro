/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo45;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo45 {

    public static void main(String[] args) {

        double numero,quadrado,raizQuadrada;
        String input;
        
        input = JOptionPane.showInputDialog(null,"Digite o numero");
        numero = Integer.parseInt(input);
        
        quadrado = Math.pow(numero,2);
        raizQuadrada = Math.sqrt(numero);
        
        JOptionPane.showMessageDialog(null,"numero = " + numero);
        JOptionPane.showMessageDialog(null,"quadrado = " + quadrado);
        JOptionPane.showMessageDialog(null,"raizQuadrada = " + raizQuadrada );
        

    }
}
