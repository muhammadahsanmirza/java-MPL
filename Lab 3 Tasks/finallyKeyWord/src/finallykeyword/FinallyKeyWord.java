/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finallykeyword;

/**
 *
 * @author Muhammad Ahsan
 */
public class FinallyKeyWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        try{
            int [] numbers = {1,2,3,4};
            System.out.println(numbers[10]);
        } catch(Exception e){
            assert System.out != null;
            System.out.println("Something went wrong");
        } finally{
            System.out.println("Try-Catch execution Finished");        
        }     
    }
}
