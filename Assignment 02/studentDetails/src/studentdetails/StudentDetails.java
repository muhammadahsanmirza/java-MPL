/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetails;

import java.util.Scanner;

/**
 *
 * @author Muhammad  Ahsan
 */

class student{
    private String cms;
    private String name;
    private float gpa;
    private int age;
    
    student(){
        this.cms = "N/A";
        this.name = "N/A";
        this.gpa = 0f;
        this.age = 0;
    }
    
    student( String cms, String name,float gpa, int age){
        this.cms = cms;
        this.name = name;
        this.gpa = gpa;        
        this.age = age;
    }
    
    void getInfo(){    
       Scanner input = new Scanner(System.in);
       System.out.println("\nEnter CMS: ");
        this.cms = input.nextLine();
        
        System.out.println("Enter Name: ");
        this.name  = input.nextLine();
        
        System.out.println("Enter gpa: ");
        this.gpa = input.nextFloat();
        
        System.out.println("Enter Age: ");
        this.age = input.nextInt();
    }
    
    void printInfo(){
       System.out.println("\nCMS: " + this.cms);
       System.out.println("Name: " + this.name);
       System.out.println("gpa: " + this.gpa);
       System.out.println("Age: " + this.age);

    }
    
}
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        student studentOne = new student("abc","Muhammad Ahsan",4.0f,23);
        studentOne.printInfo();
        
        student studentTwo = new student();
        studentTwo.getInfo();
        studentTwo.printInfo();
        
    }
}
