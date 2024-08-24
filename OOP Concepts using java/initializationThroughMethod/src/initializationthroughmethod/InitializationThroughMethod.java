/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationthroughmethod;

/**
 *
 * @author Muhammad Ahsan
 */
class student {
    int id;
    String name;
    
    void insertRecord(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    void displayRecord(){
        System.out.println(this.id + " "+ this.name);

    }
}
public class InitializationThroughMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        student s1 = new student();
        student s2 = new student();
        
        s1.insertRecord(1, "Ahsan");
        s2.insertRecord(2, "Hassan");
        
        s1.displayRecord();
        s2.displayRecord();
        
    }
}
