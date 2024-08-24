/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package createnewfile;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Muhammad Ahsan
 */
public class CreateNewFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        File java = new File("java.txt");
        File javaCopy = new File("javaCopy.txt");
        try {
            java.createNewFile();
            javaCopy.createNewFile();
        }catch (IOException e){
            System.out.println("Unable to Create File");
            e.printStackTrace();
        }
    }
}
