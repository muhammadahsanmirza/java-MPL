/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarchialinheritance;

/**
 *
 * @author Muhammad Ahsan
 */
class animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
public class HierarchialInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        cat c = new cat();
        
        c.eat();
        c.meow();
        //c.bark();     //Error!!!
    }
}
