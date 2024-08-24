/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classnotfound;

/**
 *
 * @author Muhammad Ahsan
 */
public class ClassNotFound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        try{
            Class.forName("MPL_CLass");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            
        }
    }
}
