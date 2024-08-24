/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nullpointerexample;

/**
 *
 * @author Muhammad Ahsan
 */
public class NullPointerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
       int[] dataArray = null;         //Array is null; no data
        System.out.println("Array Length:" + dataArray.length); //print array length
    }
}
