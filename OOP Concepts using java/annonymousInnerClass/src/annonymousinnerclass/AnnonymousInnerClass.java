/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package annonymousinnerclass;

/**
 *
 * @author Muhammad Ahsan
 */
abstract class person{
    abstract void eat();
}

public class AnnonymousInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        person p = new person(){
            @Override
            void eat(){
                System.out.println("Nice Fruits");
            }
        };
        p.eat();
    }
}
