/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexceptionexample;

/**
 *
 * @author Muhammad Ahsan
 */
public class ArithmeticExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        try {
            int totalNumbers = 60;
            int numbers = 75;
            if(numbers > totalNumbers){
                throw new ArithmeticException("Greater than total Numbers");
            }else{
                double percentage = (numbers / totalNumbers)*100;
                System.out.println("Your percentage: " + percentage);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Program execution continues....");
    }
}
