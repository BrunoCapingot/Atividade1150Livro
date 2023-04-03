/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo49;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Algoritimo49 {

    public static void main(String[] args) {
        
        String nome ;
        
        int n;
        
        
        
        nome = JOptionPane.showInputDialog(null,"Entre com o nome");
        
        n = nome.length();
        
        JOptionPane.showMessageDialog(null,"Nome inteiro = "+nome);
        JOptionPane.showMessageDialog(null,"Primeirio caractere" +nome.charAt(0));
        JOptionPane.showMessageDialog(null,"Ultimo caractere = "+nome.charAt(-1));
        JOptionPane.showMessageDialog(null,"Primeiro e terceiro caractere = "+nome.substring(0,3));
        JOptionPane.showMessageDialog(null,"Todos menos o primeiro = "+nome.charAt(3));
        JOptionPane.showMessageDialog(null,"Os dois ultimos = "+nome.substring(n));
        
        
        
    }
}
