/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tableusingloops;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class TableUsingLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to generate table");
        int integer = input.nextInt();
        int iFor;
        int iWhile=1;
        int iDoWhile= 1;
        
        for(iFor=1; iFor<=10; iFor++){
            System.out.println(integer + " x " + iFor + " = " + integer*iFor);
        }
        while (iWhile<=10){
            System.out.println(integer + " x " + iFor + " = " + integer*iWhile); 
            iWhile++;
        }
        do{
        System.out.println(integer + " x " + iDoWhile + " = " + integer*iDoWhile); 
            iDoWhile++;            
    }while(iDoWhile<=10);
    }
}
