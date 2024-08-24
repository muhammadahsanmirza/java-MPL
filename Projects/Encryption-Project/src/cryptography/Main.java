package cryptography;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    ImageIcon image;
    Dimension d = null;

    public Main() {
        JFrame frame = new JFrame("Swift Decode");
        d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(d.width / 2, d.height / 2);
        frame.setLocation(d.width / 4, d.height / 4);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel1.setOpaque(true);
        panel2.setOpaque(true);
        panel3.setOpaque(true);
        panel1.setBackground(Color.BLACK);
        panel1.setForeground(Color.LIGHT_GRAY);
        panel2.setBackground(Color.BLACK);
        panel2.setForeground(Color.LIGHT_GRAY);
        panel3.setBackground(Color.BLACK);
        panel3.setForeground(Color.LIGHT_GRAY);
        image = new ImageIcon("wait.GIF");
        JLabel im = new JLabel(image);
        JLabel msg = new JLabel("LOADING............");
        panel1.add(msg);
        panel2.add(im);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);
        try {
            //frame.setVisible(true);
//try
//{
Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Cryptography();
        //frame.setVisible(false);
        //frame.dispose();
//}
//catch(InterruptedException ec){}
    }

    public static void main(String args[]) throws Exception {
        new Main();
    }
}
