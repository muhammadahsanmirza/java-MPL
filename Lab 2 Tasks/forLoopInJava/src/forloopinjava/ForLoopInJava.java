/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopinjava;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class ForLoopInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number;
        int sum =0;
        double average = 0;
        System.out.println("Enter 5 numbers");
        for(int i=0; i<5; i++){
            number = input.nextInt();
            sum += number;
        }
        
        average = sum/5;
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average );
        
        
        
    }
}
