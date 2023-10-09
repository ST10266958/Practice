/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boxtwo;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class BoxTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name;
        int age;
        double weight;
        
        //housekeeping
        
        JOptionPane.showMessageDialog(null,"Enter your profile data");
        //request value and assign ro the variable--no parse--its a String
        name = JOptionPane.showInputDialog(null,"Enter your name>>>");
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age>>>"));
        weight = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your weight>>>"));
        
         JOptionPane.showMessageDialog(null,"Your captured details are as follows>>>\n" +"Name:" + name + "\nAge:"+ age +"\nWeight:" + weight);
        
        
    }
    
}
