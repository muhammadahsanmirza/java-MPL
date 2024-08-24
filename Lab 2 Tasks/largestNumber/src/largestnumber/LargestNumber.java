/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnumber;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ahsan
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Input First number: ");
        int numberOne = input.nextInt();
        System.out.println("Input Second number: ");
        int numberTwo = input.nextInt();
        System.out.println("Input Third number: ");
        int numberThree = input.nextInt();
        
        if(numberOne > numberTwo){
            if(numberOne > numberThree){
                System.out.println("Number One is Largest");
            }
        }
        if(numberTwo> numberOne){
            if(numberTwo > numberThree){
                System.out.println("Number Two is Largest");
            }
        }
        if(numberThree > numberOne){
            if(numberThree > numberTwo){
                System.out.println("Number Three is Largest");
            }
        }
        
        
    }
}
