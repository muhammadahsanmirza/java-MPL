/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meterconvertor;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */
public class MeterConvertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter length in inches ");
        double inch = input.nextDouble();
        
        double inchToMeter = inch * 0.0254;
        System.out.println("Inch to meter conversion is: " + inchToMeter + "m");
    }
}
