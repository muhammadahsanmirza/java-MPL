package Attendance;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.*;
import javax.swing.JOptionPane;

public class Login {

    int usr = 0;

    public void loginView() {
        JFrame frame = new JFrame();
        Font text = new Font("Times New Roman", Font.PLAIN, 20);
        Home hm = new Home();
        TeacherView tview = new TeacherView();
        StudentView sview = new StudentView();

        //-------------------------LOGO--------------------------
        JLabel attendance = new JLabel("ATTENDANCE");
        attendance.setForeground(Color.decode("#ffffff"));
        attendance.setBounds(100, 205, 400, 50);
        attendance.setFont(new Font("Serif", Font.BOLD, 55));
        frame.add(attendance);
        JLabel management = new JLabel("MANAGEMENT SYSTEM");
        management.setForeground(Color.decode("#ffffff"));

        management.setBounds(190, 240, 400, 50);
        management.setFont(new Font("Serif", Font.BOLD, 25));
        frame.add(management);
        //-------------------------------------------------------

        //------------------Panel----------------------------------
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 600);
        panel.setBackground(Color.decode("#000000"));
        frame.add(panel);
        //---------------------------------------------------------

        //--------------------------LOGINTEXT---------------------------
        JLabel lgn = new JLabel("LOGIN");
        lgn.setForeground(Color.decode("#ffffff"));
        lgn.setBounds(625, 100, 350, 75);
        lgn.setFont(new Font("Serif", Font.BOLD, 75));
        frame.add(lgn);
        //---------------------------------------------------------------

        //-------------------------USER--------------------------
        JLabel user = new JLabel("Username");
        user.setForeground(Color.decode("#ffffff"));
        user.setBounds(570, 250, 100, 20);
        user.setFont(text);
        frame.add(user);
        //-------------------------------------------------------

        //-----------------------USERFIELD-----------------------
        JTextField username = new JTextField();
        username.setBounds(570, 285, 360, 35);
        username.setBackground(Color.decode("#ffffff"));
        username.setForeground(Color.decode("#000000"));
        username.setFont(new Font("Serif", Font.BOLD, 15));
        frame.add(username);
        //---------------------------------------------------------

        //-------------------------Password--------------------------
        JLabel pass = new JLabel("Password");
        pass.setForeground(Color.decode("#ffffff"));
        pass.setBounds(570, 350, 100, 20);
        pass.setFont(text);
        frame.add(pass);
        //-------------------------------------------------------

        //-----------------------PASSWORDFIELD-----------------------
        JPasswordField password = new JPasswordField();
        password.setBounds(570, 385, 360, 35);
        password.setBackground(Color.decode("#ffffff"));
        password.setForeground(Color.decode("#000000"));
        frame.add(password);
        //---------------------------------------------------------

        //-------------------------WARNING--------------------------
        JLabel warning = new JLabel();
        warning.setForeground(Color.cyan);
        warning.setBounds(625, 450, 250, 30);
        warning.setHorizontalAlignment(warning.CENTER);
        frame.add(warning);
        //-------------------------------------------------------

        //----------------------LOGIN----------------------------
        JButton login = new JButton("LOGIN");
        login.setBounds(625, 500, 250, 50);
        login.setFont(new Font("Serif", Font.BOLD, 20));
        login.setBackground(Color.decode("#ffffff"));
        login.setForeground(Color.decode("#000000"));
        frame.add(login);
        login.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().isEmpty() || password.getText().isEmpty()) {
                    showErrorDialog("Username and password cannot be empty.");
                } else {
                    try {
                        int res = dbCheck(username.getText(), password.getText());
                        if (res == 0) {
                            warning.setText("NO USER FOUND!!!");
                            username.setText("");
                            password.setText("");
                        } else if (res == -1) {
                            warning.setText("WRONG PASSWORD!!!");
                            username.setText("");
                            password.setText("");
                        } else {
                            switch (res) {
                                case 1:
                                    hm.homeView(usr);
                                    break;
                                case 2:
                                    tview.tcView(usr);
                                    break;
                                case 3:
                                    sview.stView(usr);
                                    break;
                                default:
                                    break;
                            }
                            frame.dispose();
                        }
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }

                }

            }
        });
        //----------------------------------------------------------

        //-------------------------------------------------------
        frame.setSize(1000, 600);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.getContentPane().setBackground(Color.decode("#000000"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //--------------------------------------------------------------
    }

    private void showErrorDialog(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public int dbCheck(String name, String password) throws SQLException {
        String url = "jdbc:mysql://localhost:3307/attendance";
        String user = "root";
        String pass = "ahsan";
        String str = "SELECT * FROM user WHERE username = '" + name + "'";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(str);
        if (rst.next()) {
            if (rst.getString("password").equals(password)) {
                usr = rst.getInt("id");
                return rst.getInt("prio");
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
