/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author Muhammad Ahsan
 */

interface iPrintable{
    void print();
}

class printHello  implements iPrintable{
     @Override
    public void print(){
        System.out.println("Hello");
    }
}
public class InterfaceExample{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        printHello hello = new printHello();
        hello.print();
    }
   
}
