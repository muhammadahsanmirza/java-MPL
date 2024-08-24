/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productcalculator;
import java.util.Scanner;

/**
 *
 * @author Muhammad Ahsan
 */
public class ProductCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int numberOne= input.nextInt();
        System.out.println("Enter Second Number: ");
        int numberTwo= input.nextInt();
        System.out.println("Prouct of  " + numberOne + " and " + numberTwo + " is: " + numberOne*numberTwo);

        
    }
}
