package division;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Laptop links2
 */
public class Division implements ActionListener {

    private JFrame f;
    private JTextField tf1, tf2;
    private JButton b1;
    private JLabel l;

    Division() {
        f = new JFrame("Division Calculator");

        tf1 = new JTextField();
        tf2 = new JTextField();
        b1 = new JButton("=");
        l = new JLabel("/");

        tf1.setBounds(50, 100, 100, 25);
        l.setBounds(160, 100, 25, 25);
        tf2.setBounds(190, 100, 100, 25);
        b1.setBounds(300, 100, 100, 25);

        f.add(tf1);
        f.add(l);
        f.add(tf2);
        f.add(b1);

        b1.addActionListener(this);

        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {


            String tf1Value = tf1.getText();
            String tf2Value = tf2.getText();
            if (tf1Value.length() < 1 || tf2Value.length() < 1) {
                JOptionPane.showMessageDialog(f, "Enter a non zero value in each Field");
            } else {
                try {
                    Double num1 = Double.parseDouble(tf1Value);
                    Double num2 = Double.parseDouble(tf2Value);   
                    if(num2 == 0.0){
                        throw new ArithmeticException("Denominator can't be zero");
                    }
                    Double result = num1/num2;
                    String answer = String.valueOf(num1)+" / "+String.valueOf(num2)+" = "+String.valueOf(result);
                    JOptionPane.showMessageDialog(f, answer);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Enter a number in both Fields");
                }catch(ArithmeticException ex){
                    JOptionPane.showMessageDialog(f, "Enter a non-zero number in Denominator"); 
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new Division();
    }
}
