/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverloading;

/**
 *
 * @author Muhammad Ahsan
 */
class student {
    int id;
    String name;
    int age;
    
    student(int id, String name){
        this.id = id;
        this.name = name;
    }
    student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age=age;
    }
    void displayRecord(){
        System.out.println(this.id + " "+ this.name+ " "+ this.age);

    }
}
public class ConstructorOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        student s1 = new student(1, "Ahsan");
        student s2 = new student(2, "Hassan",23);
        
        s1.displayRecord();
        s2.displayRecord();
    }
}
