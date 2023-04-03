/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo47;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo47 {

    public static void main(String[] args) {
        
        int numero,c,d,u,numero1;
        String input;
        
        input = JOptionPane.showInputDialog(null,"Entre com um valor de 3 casas");
        numero = Integer.parseInt(input);
        c = numero/100;
        d = (numero%100)/10;
        u = numero % 10;
        numero1 = (u*100)+(d*10)+(c);
        
        System.out.print("\nnumero = "+numero);
        System.out.print("\ninvertido = "+numero1);
        
        
    }
}
