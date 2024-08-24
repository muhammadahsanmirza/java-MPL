/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyearcalculator;

import java.util.Scanner;

/**
 *
 * @author Laptop links2
 */
public class LeapYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the  year ");
        int year = input.nextInt();
        boolean isLeapYear;
        if (year % 4 == 0) {          
                    isLeapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }
        } else {
                    isLeapYear = false;
        }
        
        if(isLeapYear){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
