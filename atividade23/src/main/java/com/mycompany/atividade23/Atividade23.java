/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade23;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Atividade23 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String input = JOptionPane.showInputDialog(null, "Digite um numero de 3 casas!");
        int number = Integer.parseInt(input);
        int d = (number%100)/10;
        JOptionPane.showMessageDialog(null, "O algoritimo da casa das dezenas e igual a = " + d);
    }
    
}
