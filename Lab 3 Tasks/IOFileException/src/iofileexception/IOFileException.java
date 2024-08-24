/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iofileexception;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author Muhammad Ahsan
 */
public class IOFileException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        
        File obj = new File("/Desktop/MPL");
        FileInputStream fileOne = new FileInputStream(obj);
    }
}
