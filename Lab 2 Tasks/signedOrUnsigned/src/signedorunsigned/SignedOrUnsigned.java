/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package signedorunsigned;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ahsan
 */
public class SignedOrUnsigned {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a  number "); 
        int number = input.nextInt();
        
        if(number >= 0){
            System.out.println("You entered a positive Number");
        }else{
            System.out.println("You entered a negative-1 Number");            
        }

    }
}
