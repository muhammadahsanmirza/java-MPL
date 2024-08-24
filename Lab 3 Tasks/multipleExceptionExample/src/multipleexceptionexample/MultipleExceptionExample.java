/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleexceptionexample;

/**
 *
 * @author Muhammad Ahsan
 */
public class MultipleExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        try {            
            String str = null;
            int length = str.length(); // NullPointerException
            
            int[] numbers = {1, 2, 3};
            int index = 3;
            int result = numbers[index]; // ArrayIndexOutOfBoundsException

            

            int numerator = 10;
            int denominator = 0;
            int divisionResult = numerator / denominator; // ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } 

        System.out.println("Program continues after exception handling.");

    }
}
