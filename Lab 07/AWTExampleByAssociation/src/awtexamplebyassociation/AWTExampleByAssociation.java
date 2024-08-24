/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package awtexamplebyassociation;
import java.awt.*;

/**
 *
 * @author Muhammad Ahsan
 */
public class AWTExampleByAssociation {
    
    AWTExampleByAssociation(){
        Frame f = new Frame();
        Label l = new Label("Employee Id");
        Button b = new Button("Submit");
        TextField tf = new TextField();
        
        l.setBounds(20, 80, 80, 30);  
       tf.setBounds(20, 100, 80, 30);  
       b.setBounds(100, 100, 80, 30);  
       
        f.add(l);
        f.add(b);
        f.add(tf);
       
        f.setSize(500,500);
        f.setTitle("AWT Example 2");
        f.setLayout(null);
        f.setVisible(true);
       

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new AWTExampleByAssociation();
    }
}
