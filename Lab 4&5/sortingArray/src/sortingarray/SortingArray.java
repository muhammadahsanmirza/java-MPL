/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarray;

import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class SortingArray {

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
        
        int min;
        int temp;
        for(int i=0; i<size; i++){  
            min = i;
            for(int j=i+1; j<size; j++){
                if(array[j]<array[min]){
                    min = j;
                }                
            }
            if(min != i){
                temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        
        System.out.println("Sorted Array is:");
        for(int i=0; i<size; i++){            
            System.out.print(array[i] + "\t");
        }
        
        
    }
}
