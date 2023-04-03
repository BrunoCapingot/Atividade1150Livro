/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo42;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo42 {

    public static void main(String[] args) {
        int angulo;
        double rang;
        String input;
        
        
        input = JOptionPane.showInputDialog(null,"Entre com o numero de graus");
        angulo = Integer.parseInt(input);
       
        rang = (angulo*3.14)/180 ;
        
        JOptionPane.showInputDialog(null,"seno = " + Math.sin(rang));
        JOptionPane.showInputDialog(null,"Cosseno = " + Math.cos(rang));
        JOptionPane.showInputDialog(null,"Tangente = " + Math.tan(rang));
        JOptionPane.showInputDialog(null,"Cosecante = " + 1/Math.sin(rang));
        JOptionPane.showInputDialog(null,"Cecante = " + 1/Math.cos(rang));
        JOptionPane.showInputDialog(null,"Cotangente = " + 1/Math.tan(rang));
        
        
       
       
    }
}
