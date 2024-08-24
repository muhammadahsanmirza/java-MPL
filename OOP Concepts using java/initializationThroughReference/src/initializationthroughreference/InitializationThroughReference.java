/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationthroughreference;

/**
 *
 * @author Muhammad Ahsan
 */
class student {
    int id;
    String name;
}

public class InitializationThroughReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        student s1 = new student();
        student s2 = new student();
        
        s1.id=1;
        s1.name="Ahsan";
        
        s2.id=2;
        s2.name="Hassan";
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " "+ s2.name);

    }
}
