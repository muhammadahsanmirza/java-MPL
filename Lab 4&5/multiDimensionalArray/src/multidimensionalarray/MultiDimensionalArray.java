/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalarray;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class MultiDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter number of rows of Matrix:");
        int rows = input.nextInt();
        System.out.println("Enter number of columns of Matrix:");
        int columns = input.nextInt();

        int array[][] = new int [rows][columns];
        
        System.out.println("Enter " + rows*columns + " Elements to store elements in Matrix:");
        for(int i =0; i<rows;i++){
            for(int j=0; j<columns; j++){
                array[i][j] = input.nextInt();            
            }
        }
        
        System.out.println("Elements in array are: ");
        for(int i =0; i<rows;i++){
            for(int j=0; j<columns; j++){
                System.out.println("Row [" + i + "]:    Column [" + j + "] : " + array[i][j]);           
            }
        }

        
    }
}
