/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainoutsidetheclass;

/**
 *
 * @author Muhammad Ahsan
 */
class student{
    int id;
    String name;
}
public class MainOutsideTheClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        
        student s1 = new student();
        
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
