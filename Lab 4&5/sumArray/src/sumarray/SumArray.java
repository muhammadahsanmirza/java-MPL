/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarray;

import java.util.Scanner;

/**
 *
 * @author Laptop links2
 */
public class SumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter size of Array");
        int size = input.nextInt();
        
        int array[] = new int[size];
        
        System.out.println("Enter Elements of Array");
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        
        int sum=0;
        for(int i=0; i<size; i++){
            sum += array[i];
        }
        
        System.out.println("Sum of array elements is: " + sum);
    }
}
