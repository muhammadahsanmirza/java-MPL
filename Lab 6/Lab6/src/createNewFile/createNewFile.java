package createNewFile;
import java.io.File;


public class createNewFile extends Application {

    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        File javaCopy = new File("java_copy.txt");
        if (javaCopy.delete()){
            System.out.println("I have deleted " + javaCopy.getName());
        }else{
            System.out.println("Error!! File Not Found");
        }

    }

}
