/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytwo;

/**
 *
 * @author lab_services_student
 */
public class ArrayTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // basic double array
        // data type [] arrayname = {, , , , };
                               // 0      1    2        3     4      5
        double [] listDouble = {5.5, 17.2, 135.89, 0.342, 45.74, 766.78};
        System.out.println("The values of the array >>>>>");
        for (int i = 0; i < listDouble.length; i++) {
            System.out.println(listDouble[i]);
            
        }
        //reverse the array
        System.out.println("\n\nThe array reversed >>>>");
        for (int i = listDouble.length-1; i>=0; i--) {
            System.out.print(listDouble[i] + "\t");
            
        }
        System.out.println("Memory slot 4 has:" + listDouble[4]);
    }
    
}
