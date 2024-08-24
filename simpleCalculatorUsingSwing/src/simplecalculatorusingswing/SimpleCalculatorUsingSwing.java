/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculatorusingswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Muhammad Ahsan
 */
public class SimpleCalculatorUsingSwing implements ActionListener {

    JFrame f = new JFrame();
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    SimpleCalculatorUsingSwing() {

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        b1 = new JButton("+");
        b1.setBounds(70, 200, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(130, 200, 50, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int numOne = Integer.parseInt(tf1.getText());
        int numTwo = Integer.parseInt(tf2.getText());
        int numThree=0;
        
        if(e.getSource()==b1){
            numThree=numOne+numTwo;
        }
        if(e.getSource()==b2){
            numThree=numOne-numTwo;
        }
        
        String result = String.valueOf(numThree);
        tf3.setText(result);
                
    }
    
    public static void main(String[] args) {
        new SimpleCalculatorUsingSwing();
    }
}
