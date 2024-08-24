/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author Muhammad Ahsan
 */
class adder{
    static int add(int numOne,int numTwo){
        return numOne + numTwo;
    }
    static int add(int numOne,int numTwo,int numThree){
        return numOne + numTwo+numThree;
    }
            
}
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
         System.out.println(adder.add(11, 22));
         System.out.println(adder.add(11, 22,33));
    }
}
