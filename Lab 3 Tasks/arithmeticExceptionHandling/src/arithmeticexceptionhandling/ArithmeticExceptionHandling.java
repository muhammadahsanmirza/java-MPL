/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexceptionhandling;

/**
 *
 * @author Muhammad Ahsan
 */
public class ArithmeticExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        try {
            int dividedByZero = 5 / 0;
            System.out.println("Rest of Code in Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Arithematic Exception => " + e.getMessage());            
        }

    }
}
