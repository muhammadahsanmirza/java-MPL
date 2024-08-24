/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleinhertance;

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
public class SingleInhertance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        dog d = new dog();
        d.eat();
        d.bark();        
        
    }
}
