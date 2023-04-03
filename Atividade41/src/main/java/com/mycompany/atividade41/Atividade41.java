/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade41;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Atividade41 {

    public static void main(String[] args) {
        int a,b,c,d,mp;
        String input;
        
       input = JOptionPane.showInputDialog(null,"Entre com o primeiro numero");
       a = Integer.parseInt(input);
       input = JOptionPane.showInputDialog(null,"Entre com o segundo valor");
       b = Integer.parseInt(input);
       input = JOptionPane.showInputDialog(null,"Entre com o terceiro valor");
       c = Integer.parseInt(input);
       input = JOptionPane.showInputDialog(null,"Entre com o quarto valor");
       d = Integer.parseInt(input);
       
       mp = ((a*1)+(b*2)+(c*3)+(d*4))/10;
       
       JOptionPane.showMessageDialog(null, mp);
    }
}
