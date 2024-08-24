/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.FlowLayout;
import javax.swing.*;

//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;

/**
 *
 * @author Muhammad Ahsan
 */
public class Jframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JLabel l = new JLabel("JFrame By Example");
        JButton b = new JButton();
        panel.add(l);
        panel.add(b);
        b.setText("Click Me");
        
        f.add(panel);
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
    }
}
