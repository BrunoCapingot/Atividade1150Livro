/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade26;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Atividade26 {

    public static void main(String[] args) {

    int dia,mes,ano,number,ndata;
        
        
    String input = JOptionPane.showInputDialog(null,"Digite uma data no formato DDMMAA");
    number = Integer.parseInt(input);
    
    dia = number/10000;
    mes = (number%10000)/100;
    ano = number%100;
    ndata = (mes*10000)+(dia*100)+ano;
    
    System.out.print("\nDia = "+dia);
    System.out.print("\nMes = "+mes);
    System.out.print("\nAno = "+ano);
    System.out.print("\nndata = "+ndata);
    System.out.print("\n"); 
    }
}
