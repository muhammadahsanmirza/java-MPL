/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethods;

/**
 *
 * @author Muhammad Ahsan
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        String userName = "             Muhammad Ahsan ";
        System.out.println("Lower Case ----> " + userName.toLowerCase());
        System.out.println("Upper Case ----> " + userName.toUpperCase());
        System.out.println(userName);
        System.out.println(userName.trim());
        System.out.println("Starts With blank space ----> " + userName.startsWith(" "));
        System.out.println("Ends With 'n' ----> " + userName.endsWith("n"));
        System.out.println("Length ----> " + userName.length());
        System.out.println("Sub String ----> " + userName.substring(13,21));
        char [] characterArray = userName.toCharArray();
        System.out.println(characterArray);

    }
}
