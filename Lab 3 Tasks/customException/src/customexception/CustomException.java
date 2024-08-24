/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception;

/**
 *
 * @author Muhammad Ahsan
 */
public class CustomException {
    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Person is not eligible for vote");
        }else{
            System.out.println("Person is eligible for vote");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        validate(13);
    }
}
