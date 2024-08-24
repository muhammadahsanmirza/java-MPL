/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deletingfile;
import java.io.File;

/**
 *
 * @author Laptop links2
 */
public class DeletingFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        File javaCopy = new File("java_copy1.txt");
        if (javaCopy.delete()){
            System.out.println("I have deleted " + javaCopy.getName());
        }else{
            System.out.println("Error!! File Not Found");
        }
    }
}
