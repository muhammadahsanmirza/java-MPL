/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;
import java.util.Scanner;
/**
 *
 * @author  Muhammad Ahsan
 */
public class Introduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Enter your ARID number: ");       
        String aridNumber = input.nextLine();
        
        System.out.println("Name: " + name);
        System.out.println("Arid Number: " + aridNumber);
    }
}
