/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package throwandthrows;

/**
 *
 * @author Muhammad Ahsan
 */
public class ThrowAndThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        try {
            int[] numbers = {1, 2, 3};
            int index = 4;
            int result = getElementAtIndex(numbers, index);
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    public static int getElementAtIndex(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        return arr[index];
    }
}
