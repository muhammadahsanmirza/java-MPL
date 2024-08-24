/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickscounter;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Muhammad Ahsan
 */
public class ClicksCounter implements ActionListener{
    
    int counter = 0;
    JLabel l;
    @SuppressWarnings("LeakingThisInConstructor")
    ClicksCounter(){
        JFrame f = new JFrame("Clicks Counter");
         l = new JLabel();
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        
        l.setText("Clicks Cont: 0");
        b1.addActionListener(this);
        f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.X_AXIS));
        f.add(l);
        f.add(b1);
        f.add(b2);
        
        f.getRootPane().setDefaultButton(b1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new ClicksCounter();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        String count = String.valueOf(counter);
        String str = "Clicks Count: " + count;
        l.setText(str);
        
    }
}
