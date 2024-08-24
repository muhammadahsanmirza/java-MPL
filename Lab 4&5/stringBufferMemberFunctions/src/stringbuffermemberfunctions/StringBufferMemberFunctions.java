/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffermemberfunctions;

/**
 *
 * @author Laptop links2
 */
public class StringBufferMemberFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        StringBuffer sb = new StringBuffer("Hello World");
        
        System.out.println("String ---> " + sb);

        System.out.println("Reversed String ---> " + sb.reverse());
        sb.reverse();
        
        System.out.println("After Deleting 0 to 4 index of String Buffer --->" + sb.delete(0, 5));

        
    }
}
