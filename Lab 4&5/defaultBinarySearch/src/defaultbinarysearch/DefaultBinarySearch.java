/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Laptop links2
 */
public class DefaultBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int array[] = {23,34,45,56,67};
        
        int element = 45;
        
        int index = Arrays.binarySearch(array, element);
        
        if(index>=0){            
            System.out.println("Element " + element + " is found at " + index + " index.");
        }else{            
            System.out.println("Element not found");            
        }
    }
}
