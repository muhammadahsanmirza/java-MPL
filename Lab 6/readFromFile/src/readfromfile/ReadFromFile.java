/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readfromfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Laptop links2
 */
public class ReadFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        File java = new File("java.txt");
        try {
            Scanner input = new Scanner(java);
            while (input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
