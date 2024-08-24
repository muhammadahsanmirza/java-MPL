/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number upto 5:");
        int number = input.nextInt();
        
        switch(number){
            case 1:
                System.out.println("I am One");
                break;
            case 2:
                System.out.println("I am Two");
                break;
            case 3:
                System.out.println("I am Three");
                break;
            case 4:
                System.out.println("I am Four");
                break;
            case 5:
                System.out.println("I am Five");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
