/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carcarechoice;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class CarCareChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] items = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        
        // ask the user to chose an option
        // display the price
        // handle incorrect entry
        String menu = "Entry selection";
        for (int i = 0; i < items.length; i++) {
            menu += "\n" + items[i];
            
            
        }
         String userInput = JOptionPane.showInputDialog(null, menu);
         
         // Find the matching price
         int matchedIndex = -1;
         for (int i = 0; i < items.length; i++) {
             if (userInput.equalsIgnoreCase(items[i])){
                 matchedIndex = i;
                 break;
                 
             }
            
        }
         // Display the price or handle incorrect entry
         if(matchedIndex != -1){
        JOptionPane.showMessageDialog(null,
                "The price for " + userInput + "is R" + prices[matchedIndex]);
             
         }else{
             JOptionPane.showMessageDialog(null,"Inavalid entry, do better");
         }
        
    }
    //the value -1 is used as a default value for the 
    // matchingPrice variable. It is intialized by -1
    //Indicate that no matching price has been found yet 
    
}
