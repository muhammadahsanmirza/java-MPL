/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelorconsonent;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class VowelOrConsonent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an Alphabet");
        String character = input.nextLine().toLowerCase();
        
        boolean isUpperCase = character.charAt(0) >=65 && character.charAt(0) <= 90;
        boolean isLowerCase = character.charAt(0) >=97 && character.charAt(0) <= 122; 
        boolean isVowel =  character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u");
        
        if(character.length()>1){
        System.out.println(" !! Error. Not a single character.");            
        }else if(!(isUpperCase || isLowerCase)){
        System.out.println(" !! Error. Not a character. Enter upper or lower case character");          
        }else if(isVowel){
        System.out.println(" Input character is Vowel.");                        
        }else{
        System.out.println(" Input character is Consonent.");                                    
        }             
    }
}
