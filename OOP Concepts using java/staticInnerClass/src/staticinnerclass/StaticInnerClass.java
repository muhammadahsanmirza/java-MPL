/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package staticinnerclass;

/**
 *
 * @author Laptop links2
 */
class outer{
    int x=10;
    static class inner{
        
         int y=5;
    }
}
public class StaticInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        outer.inner innerClass = new outer.inner();
        
        System.out.println(innerClass.y);
    }
}
