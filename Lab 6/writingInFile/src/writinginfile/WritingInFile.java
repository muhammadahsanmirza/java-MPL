/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package writinginfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Muhammad Ahsan
 */
public class WritingInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        try {
            FileWriter fileWriter = new FileWriter("java.txt");
            fileWriter.write("Java is a type of coffe.\nJava is a High-level programming language.");
            fileWriter.close();
        }catch (IOException e){
            System.out.println("IO Exception occured");
        }
    }
}
