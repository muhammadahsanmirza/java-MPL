/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseoperators;

/**
 *
 * @author Muhammad Ahsan
 */
public class BitWiseOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        int numOne = 5;
        int numTwo = 7;
        System.out.println("numOne & numTwo: " + (numOne & numTwo)) ;
        System.out.println("numOne | numTwo: " + (numOne | numTwo)) ;
        System.out.println("numOne ^ numTwo: " + (numOne ^ numTwo)) ;
        System.out.println("~ numOne : " + (~numOne)) ;
        
        numOne &= numTwo;
        System.out.println("numOne : " +  numOne) ;


    }
}
