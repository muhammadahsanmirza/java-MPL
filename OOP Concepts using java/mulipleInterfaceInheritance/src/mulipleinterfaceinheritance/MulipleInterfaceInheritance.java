/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mulipleinterfaceinheritance;

/**
 *
 * @author Muhammad Ahsan
 */
interface iPrintable{
    void print();
}
interface iShowable{
    void show();
}
class greetings  implements iPrintable,iShowable{
     @Override
    public void print(){
        System.out.println("Hello");
    }
    @Override
     public void show(){
        System.out.println("Welcome");
    }
}
public class MulipleInterfaceInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        greetings g = new greetings();
        g.print();
        g.show();
    }
}
