/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inputmismatchexceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class InputMismatchExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Invalid input. Please enter an integer.");
        }
    }
}
