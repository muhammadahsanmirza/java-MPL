/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author Muhammad Ahsan
 */
class outer{
    int x=10;
    class inner{
        
         int y=5;
    }
}
public class InnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        outer outerClass = new outer();
        outer.inner innerClass = outerClass.new inner();
        
        System.out.println(outerClass.x + innerClass.y);

        
    }
}
