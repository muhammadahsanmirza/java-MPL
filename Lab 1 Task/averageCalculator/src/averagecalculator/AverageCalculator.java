/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package averagecalculator;
import java.util.Scanner;

/**
 *
 * @author  Muhammad Ahsan
 */
public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");        
        double numberOne= input.nextInt();
        
        System.out.println("Enter Second Number: ");
        double numberTwo= input.nextInt();
        
        System.out.println("Enter Third Number: ");
        double numberThree= input.nextInt();

        double average;
        average = (numberOne + numberTwo + numberThree)/3;
        
        System.out.println("Average of  " +numberOne + ", " + numberTwo + " and " + numberThree + " is " + average);
    }
}
