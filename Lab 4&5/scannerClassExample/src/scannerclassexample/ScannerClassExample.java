/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerclassexample;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class ScannerClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = input.nextInt();
        System.out.println("You Entered: " + number);

    }
}
