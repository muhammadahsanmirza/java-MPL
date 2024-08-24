/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package awtexample1;
import java.awt.*;

/**
 *
 * @author Muhammad Ahsan
 */
public class AWTExample1 extends Frame{
    AWTExample1(){
        Button b = new Button("Click Me");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(500,500);
        setTitle("AWT Example 1");
        setLayout(null);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-Arid-737");
        // TODO code application logic here
        new AWTExample1();
    }
}
