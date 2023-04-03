/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo48;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo48 {

    public static void main(String[] args) {
        
        double sm, qtdade, preco, vp, vd;
        String input;
        input = JOptionPane.showInputDialog(null,"entre com o valor de salario minimo");
        sm = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null,"entre com a quantidade de KW");
        qtdade = Double.parseDouble(input);
        preco = sm/700;
        vp = preco*qtdade;
        vd = vp*0.9;
        
        JOptionPane.showMessageDialog(null, "Preço por KW, "+preco+" valor a ser pago "+vp+" valor com desconto "+vd);
        
        
        
    }
}
