/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Muhammad Ahsan
 */
class student{
    private String name;
    
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}

public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        student studentOne = new student();
        
        studentOne.setName("Muhammad Ahsan");
        System.out.println(studentOne.getName());
    }
}
