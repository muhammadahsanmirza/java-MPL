/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tableprinter;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ahsan
 */
public class TablePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number whom table you want to print:");
        int number = input.nextInt();
        
        for(int i =1; i<=10; i++){
            
            System.out.println(number + " x " + i + " = " + number*i);
        }
        
    }
}
