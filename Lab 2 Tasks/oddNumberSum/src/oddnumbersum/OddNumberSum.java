/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oddnumbersum;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ahsan
 */
public class OddNumberSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many odd numbers you want to add? ");
        int number;
        number = input.nextInt();
        number = number * 2;
        int iFor;
        int iWhile = 1;
        int iDoWhile = 1;
        int sum = 0;

        
        System.out.println("Do-While Loop");
        do {

            sum += iDoWhile;
            System.out.println("Odd Number: " + iDoWhile );

            iDoWhile = iDoWhile + 2;
        } while (iDoWhile < number);
                    System.out.println("Sum of odd Numbers is: " + sum);
        
        System.out.println("For Loop");
        sum=0;
        for(iFor=0; iFor<number; iFor++){
            if(iFor%2 == 0){
                continue;
            }
            sum+=iFor;
            System.out.println("Odd Number: " + iFor);
        }
                    System.out.println("Sum of odd Numbers is: " + sum);
                    
        System.out.println("While Loop");
        sum = 0;
        while (iWhile < number) {

            sum += iWhile;
            System.out.println("Odd Number: " + iWhile);

            iWhile = iWhile + 2;
        }
                   System.out.println("Sum of odd Numbers is: " + sum);

    }
}
