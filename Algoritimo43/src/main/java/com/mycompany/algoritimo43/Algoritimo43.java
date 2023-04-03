/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo43;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo43 {

    public static void main(String[] args) {
    
        int numero;
        double logaritimo;
        
        String input;
        
        input = JOptionPane.showInputDialog(null,"Entre com um logaritimando");
        numero = Integer.parseInt(input);
        
        logaritimo = Math.log(numero)/ Math.log(10);
        
        System.out.print("\n logaritomo = " + logaritimo);
        System.out.print("\n");
                
    
    
    }
}
