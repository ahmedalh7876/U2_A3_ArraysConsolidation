/*
 * Author: Ahmed Al-Hayali
 * Last edit: 30/10/2018
 * This program finds the average of a student's yearly grade
 */

package u2_a3_arraysconsolidation;

//Imports console keystroke scanner
import java.util.Scanner;

public class U2_A3_ArraysConsolidation {
    public static void main(String[] args) {
        
        //Initializes scanner for keystrokes in console
        Scanner kInput = new Scanner (System.in);
        
        //Declares and initializes array, and total double
        double [] marks = new double [8];
        double total = 0;
        
        //Prompts user to enter their 8 marks
        System.out.println("Please enter your 8 class marks for the past year");
        
        //Runs a for loop to extract the marks, then add them to a total
        for (int i = 0; i <8; i = i + 1) {
            marks[i] = kInput.nextDouble();
            total += marks[i];
        }
        
        //Divides number by 8 to find average, then displays it
        System.out.println("The average of your marks is: " + (total/8));
        
    }
    
}
