/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author Laptop links2
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer(20);
        System.out.println(sb.capacity());
         System.out.println(sb.length());
         sb.append("Hello world");
         System.out.println(sb.capacity());
         System.out.println(sb.length());
    }
}
