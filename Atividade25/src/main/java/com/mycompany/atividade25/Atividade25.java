/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade25;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Atividade25 {

    public static void main(String[] args) {
        int dia,mes,ano,number;
        String input;
        
        input = JOptionPane.showInputDialog(null,"Digite uma data no formato ddmmaa");
        number = Integer.parseInt(input);
        dia = number / 10000;
        mes = (number % 10000) / 100;
        ano = number % 100;
        System.out.print("\n Os dias sao: "+dia);
        System.out.print("\n Os meses sao: "+mes);
        System.out.print("\n Os anos sao: "+ano);
        
        
        
        
        
    }
}
