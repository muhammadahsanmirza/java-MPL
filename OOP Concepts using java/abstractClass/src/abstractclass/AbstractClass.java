/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Muhammad Ahsan
 */
abstract class bike{
    abstract void run();
}
class honda extends bike{

    @Override
    void run() {
        System.out.println("Running safely");
    }
    
}
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        honda obj = new honda();
        obj.run();
    }
}
