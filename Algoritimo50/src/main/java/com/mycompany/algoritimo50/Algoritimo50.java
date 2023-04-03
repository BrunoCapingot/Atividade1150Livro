/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo50;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo50 {

    public static void main(String[] args) {
        
        double perimetro, area,diagonal,base,altura;
        String input;
        input = JOptionPane.showInputDialog(null,"Insira o valor de base");
        base = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null,"Insira o valor de altura");
        altura = Double.parseDouble(input);
        
        perimetro = 2*(base+altura);
        area = base*altura;
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        
        JOptionPane.showMessageDialog(null,"Perimetro = " + perimetro);
        JOptionPane.showMessageDialog(null,"Area = " + area);
        JOptionPane.showMessageDialog(null,"Diagonal = " + diagonal);
        
    }
}
