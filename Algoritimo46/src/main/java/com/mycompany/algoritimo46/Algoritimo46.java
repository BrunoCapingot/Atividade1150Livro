/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo46;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo46 {

    public static void main(String[] args) {
        
        double saldo,nSaldo;
        String input;
        
        input = JOptionPane.showInputDialog(null,"Digite o saldo");
        saldo = Integer.parseInt(input);
        nSaldo = saldo * 1.01;
        JOptionPane.showMessageDialog(null, nSaldo);
        
        
    }
}
