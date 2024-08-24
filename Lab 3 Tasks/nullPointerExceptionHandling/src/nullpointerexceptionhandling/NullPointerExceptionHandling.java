/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nullpointerexceptionhandling;

/**
 *
 * @author Muhammd Ahsan
 */
public class NullPointerExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        String ptr = null;
        try {
            if (ptr.equals("gfg")) {
                System.out.println("Same");
            } else {
                System.out.println("Not Same");
            }
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Caught " + e.getMessage());
        }

    }
}
