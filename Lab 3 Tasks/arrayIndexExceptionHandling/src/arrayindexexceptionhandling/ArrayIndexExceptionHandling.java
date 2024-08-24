/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayindexexceptionhandling;

/**
 *
 * @author Muhammad Ahsan
 */
public class ArrayIndexExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        String [] stringArray = {"Muhammad Ahsan", "Hassan Nawaz Khan Usama", "Rana Haseeb ur Rehman", "Abdul Subhan", "Muneeb Ahmed", "Huzaifa Bin Shahzad"};
        try{
            for(int i=0; i <= stringArray.length; i++){
            System.out.println(stringArray[i]);
       }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not Found");
        }
        
    }
}
