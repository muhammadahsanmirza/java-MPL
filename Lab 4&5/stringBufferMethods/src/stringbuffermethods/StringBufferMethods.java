/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffermethods;

/**
 *
 * @author Muhammd Ahsan
 */
public class StringBufferMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");        
        // TODO code application logic here
        StringBuffer sb = new StringBuffer("M Ahsan");
        
        System.out.println(sb);
        sb.replace(0, 1, "Muhammad");
        System.out.println("M replaced with Muhammad -->" + sb);
        
        sb.append(" Mirza");
        System.out.println("After Appending --> " + sb);
        
        sb.reverse();
        System.out.println("After reverse --> " + sb);
        sb.reverse();

        sb.delete(15, 20);
        System.out.println("After Deleting --> " + sb);
        
        sb.insert(14, 'M');
        System.out.println("After Inserting --> " + sb);

        System.out.println("String Buffer length -->" + sb.length());
        System.out.println("String Buffer length -->" + sb.capacity());
        

    }
}
