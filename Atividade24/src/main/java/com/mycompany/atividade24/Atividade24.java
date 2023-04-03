/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade24;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Atividade24 {

    public static void main(String[] args) {
    
    int number,d;
    
    String input = JOptionPane.showInputDialog(null,"Digite um numero de 3 casas!");
    number = Integer.parseInt(input);
    
    d = (number/10)%10;
    
    JOptionPane.showMessageDialog(null, d);
    
    
    }
}
