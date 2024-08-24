/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationthroughconstructor;

/**
 *
 * @author Muhammad Ahsan
 */
class student {
    int id;
    String name;
    
    student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void displayRecord(){
        System.out.println(this.id + " "+ this.name);

    }
}
public class InitializationThroughconstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        student s1 = new student(1, "Ahsan");
        student s2 = new student(2, "Hassan");
        
        s1.displayRecord();
        s2.displayRecord();
    }
}
