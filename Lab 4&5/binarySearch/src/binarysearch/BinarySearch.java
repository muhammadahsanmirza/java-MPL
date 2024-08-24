/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("Enter element you want to Search");
        int element = input.nextInt();
        
        int index = Arrays.binarySearch(array, element);
        
        if(index>=0){            
            System.out.println("Element " + element + " is found at " + index + " index.");
        }else{            
            System.out.println("Element not found");            
        }
        
    }
}
