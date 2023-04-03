/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade40;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Capingote
 */
public class Atividade40 {

    public static void main(String[] args) {
        int quac, rest, val1, val2;
        String input;
        input = JOptionPane.showInputDialog(null,"Insira o valor do dividendo");
        val1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null,"Insira o valor do divisor");
        val2 = Integer.parseInt(input);
        
        quac = val1 / val2;
        rest = val1 % val2;
        
        System.out.print("\n");
        System.out.print("\ndividendo" + val1);
        System.out.print("\ndivisor" + val2);
        System.out.print("\nquociente" + quac);
        System.out.print("\nresto "+ rest);
        System.out.print("\n");
        
        
        
        
    }
}
