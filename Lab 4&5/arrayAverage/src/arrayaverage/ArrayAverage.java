/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayaverage;

import java.util.Scanner;

/**
 *
 * @author Laptop links2
 */
public class ArrayAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int sum=0;
        int average;
        int size = 5;
        
        int array[] = new int[size];
        
        System.out.println("Enter Elements of Array");
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        
        
        for(int i=0; i<size; i++){
            sum += array[i];
        }
        average = sum/size;
        System.out.println("Average of array elements is: " + average);
    }
}
