/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.schoolmanagementsystem;

/**
 *
 * @author Muhammad Ahsan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;

/**
 *
 * @author Muhammad Ahsan
 */
class student implements ActionListener {

    private JFrame f = new JFrame("Teacher Menu");
    private JTextField tf1, tf2, tf3;
    private JButton registerStudent, viewStudent, deleteStudent, updateStudent;

    void registerStudentUI() {
        JLabel idLabel = new JLabel("Student ID:");
        JLabel nameLabel = new JLabel("Student Name:");
        JLabel classLabel = new JLabel("Student Class:");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        registerStudent = new JButton("Register");

        f.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns, with gaps
        f.add(idLabel);
        f.add(tf1);
        f.add(nameLabel);
        f.add(tf2);
        f.add(classLabel);
        f.add(tf3);

        f.add(registerStudent);
        f.add(new JLabel());

        registerStudent.addActionListener(this);

        f.setTitle("Register Student");
        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    void viewStudentUI() {
        viewStudent = new JButton("View Student");
        JLabel l = new JLabel("Enter Student ID: ");
        tf1 = new JTextField();
        tf1.setColumns(15);

        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Center the components both horizontally and vertically
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding
        f.add(l, gbc);

        gbc.gridx = 1;
        f.add(tf1, gbc);

        gbc.gridx = 2;
        f.add(viewStudent, gbc);

        // Add action listeners for buttons
        viewStudent.addActionListener(this);

        f.setTitle("View Student Record");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    void deleteStudentUI() {
        deleteStudent = new JButton("Delete Student");
        JLabel l = new JLabel("Enter Student ID: ");
        tf1 = new JTextField();
        tf1.setColumns(15);

        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Center the components both horizontally and vertically
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding
        f.add(l, gbc);

        gbc.gridx = 1;
        f.add(tf1, gbc);

        gbc.gridx = 2;
        f.add(deleteStudent, gbc);

        // Add action listeners for buttons
        deleteStudent.addActionListener(this);
        f.setTitle("Delete Student Record");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    void updateStudentUI() {
        JLabel idLabel = new JLabel("Enter Student ID:");
        JLabel nameLabel = new JLabel("Update Student Name:");
        JLabel classLabel = new JLabel("Update Student Class:");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        updateStudent = new JButton("Update Credentials");

        f.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns, with gaps
        f.add(idLabel);
        f.add(tf1);
        f.add(nameLabel);
        f.add(tf2);
        f.add(classLabel);
        f.add(tf3);

        f.add(updateStudent);
        f.add(new JLabel());

        updateStudent.addActionListener(this);

        f.setTitle("Update Student Record");
        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerStudent) {
            try {
                String studentId = tf1.getText();
                String studentName = tf2.getText();
                String studentClass = tf3.getText();

                if (studentId.length() == 0 || studentName.length() == 0 || studentClass.length() == 0) {
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    JOptionPane.showMessageDialog(f, "Insert all values!");
                } else {
                    // JDBC connection parameters
                    String url = "jdbc:mysql://localhost:3306/school";
                    String username = "ahsan";
                    String password = "ahsan";

                    try (Connection connection = DriverManager.getConnection(url, username, password)) {
                        // SQL query to insert data into the students table
                        String sql = "INSERT INTO students (student_id, student_name, student_class) VALUES (?, ?, ?)";

                        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                            // Set values for the prepared statement
                            preparedStatement.setString(1, studentId);
                            preparedStatement.setString(2, studentName);
                            preparedStatement.setString(3, studentClass);

                            // Execute the query
                            preparedStatement.executeUpdate();

                            tf1.setText("");
                            tf2.setText("");
                            tf3.setText("");
                            JOptionPane.showMessageDialog(f, "Student registered Successfully!");
                        }
                    } catch (SQLException exc) {
                        System.out.println("Database Exception Occurred: " + exc.getMessage());
                    }
                }
            } catch (Exception exc) {
                System.out.println("Exception Occurred: " + exc.getMessage());
            }
        } else if (e.getSource() == viewStudent) {
            String str = tf1.getText();

            if (str.length() > 0) {
                // JDBC connection parameters
                String url = "jdbc:mysql://localhost:3306/school";
                String username = "ahsan";
                String password = "ahsan";

                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // SQL query to retrieve student data based on student ID
                    String sql = "SELECT * FROM students WHERE student_id = ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                        preparedStatement.setString(1, str);

                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
                            if (resultSet.next()) {
                                // Extract data from the result set
                                String studentId = resultSet.getString("student_id");
                                String studentName = resultSet.getString("student_name");
                                String studentClass = resultSet.getString("student_class");

                                // Display the retrieved data
                                String newLine = "Student ID: " + studentId + "\nName: " + studentName + "\nClass: " + studentClass;
                                tf1.setText("");
                                JOptionPane.showMessageDialog(f, newLine);
                            } else {
                                JOptionPane.showMessageDialog(f, str + " is an invalid ID!!");
                                tf1.setText("");
                            }
                        }
                    }
                } catch (SQLException ex) {
                    System.out.println("Database Exception Occurred: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(f, "Enter a value!!");
            }
        } else if (e.getSource() == deleteStudent) {
            String wordToDelete = tf1.getText();

            if (wordToDelete.length() > 0) {
                // JDBC connection parameters
                String url = "jdbc:mysql://localhost:3306/school";
                String username = "ahsan";
                String password = "ahsan";

                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // SQL query to delete student data based on student ID
                    String sql = "DELETE FROM students WHERE student_id = ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                        preparedStatement.setString(1, wordToDelete);

                        int rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) {
                            tf1.setText("");
                            JOptionPane.showMessageDialog(f, "Record Deleted Successfully");
                        } else {
                            JOptionPane.showMessageDialog(f, "Record not found. No record deleted.");
                        }
                    }
                } catch (SQLException exc) {
                    System.out.println("Database Exception Occurred: " + exc.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(f, "Enter a value!!");
            }
        } else if (e.getSource() == updateStudent) {
            String studentId = tf1.getText();
            String updatedName = tf2.getText();
            String updatedClass = tf3.getText();

            if (studentId.length() > 0) {
                // JDBC connection parameters
                String url = "jdbc:mysql://localhost:3306/school";
                String username = "ahsan";
                String password = "ahsan";

                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // SQL query to update student data based on student ID
                    String sql = "UPDATE students SET student_name = ?, student_class = ? WHERE student_id = ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                        preparedStatement.setString(1, updatedName);
                        preparedStatement.setString(2, updatedClass);
                        preparedStatement.setString(3, studentId);

                        int rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) {
                            tf1.setText("");
                            tf2.setText("");
                            tf3.setText("");
                            JOptionPane.showMessageDialog(f, "Record Updated Successfully");
                        } else {
                            JOptionPane.showMessageDialog(f, "Student ID not found. No record updated.");
                        }
                    }
                } catch (SQLException exc) {
                    System.out.println("Database Exception Occurred: " + exc.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(f, "Enter a Student ID!!");
            }
        }

    }
}

class subject implements ActionListener {

    private JFrame f = new JFrame("Teacher Menu");
    private JButton addSubject, viewSubject, deleteSubject, updateSubject;
    private JLabel l;
    private JTextField tf1, tf2, tf3;
    FileWriter writer;

    void addSubjectUI() {
        JLabel nameLabel = new JLabel("Subject Name:");
        JLabel classLabel = new JLabel(" Course Code:");
        tf1 = new JTextField();
        tf2 = new JTextField();
        addSubject = new JButton("Add Subject");

        f.setLayout(new GridLayout(4, 2, 10, 10));

        f.add(nameLabel);
        f.add(tf1);
        f.add(classLabel);
        f.add(tf2);
        f.add(new JLabel());
        f.add(new JLabel());
        f.add(addSubject);
        f.add(new JLabel());

        addSubject.addActionListener(this);

        f.setTitle("Add Subject");
        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    void viewSubjectUI() {
        viewSubject = new JButton("View Subject");
        l = new JLabel("Enter Subject Name/course Code: ");
        tf1 = new JTextField();
        tf1.setColumns(10);

        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Center the components both horizontally and vertically
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding
        f.add(l, gbc);

        gbc.gridx = 1;
        f.add(tf1, gbc);

        gbc.gridx = 2;
        f.add(viewSubject, gbc);

        // Add action listeners for buttons
        viewSubject.addActionListener(this);
        f.setTitle("View Subject");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    void deleteSubjectUI() {
        deleteSubject = new JButton("Delete Subject");
        l = new JLabel("Enter Subject Name/Course Code: ");
        tf1 = new JTextField();
        tf1.setColumns(10);

        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Center the components both horizontally and vertically
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding
        f.add(l, gbc);

        gbc.gridx = 1;
        f.add(tf1, gbc);

        gbc.gridx = 2;
        f.add(deleteSubject, gbc);

        deleteSubject.addActionListener(this);
        f.setTitle("View Subject");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    void updateSubjectUI() {
        JLabel courseLabel = new JLabel("Enter old Course Code:");
        JLabel nameLabel = new JLabel("Enter New Subject Name:");
        JLabel courseCodeLabel = new JLabel("Enter New Course Code:");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        addSubject = new JButton("Add Subject");

        f.setLayout(new GridLayout(4, 2, 10, 10));

        f.add(courseLabel);
        f.add(tf1);
        f.add(nameLabel);
        f.add(tf2);
        f.add(courseCodeLabel);
        f.add(tf3);

        f.add(addSubject);
        f.add(new JLabel());

        addSubject.addActionListener(this);

        f.setTitle("Add Subject");
        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the action event for the viewSubject button
        if (e.getSource() == addSubject) {
            try {
                String subjectName = tf1.getText();
                String courseCode = tf2.getText();

                if (subjectName.length() == 0 || courseCode.length() == 0) {
                    tf1.setText("");
                    tf2.setText("");
                    JOptionPane.showMessageDialog(f, "Insert all values!");
                } else {
                    // JDBC connection parameters
                    String url = "jdbc:mysql://localhost:3306/school";
                    String username = "ahsan";
                    String password = "ahsan";

                    try (Connection connection = DriverManager.getConnection(url, username, password)) {
                        // SQL query to insert data into the subjects table
                        String sql = "INSERT INTO subjects (subject_name, course_code) VALUES (?, ?)";

                        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                            // Set values for the prepared statement
                            preparedStatement.setString(1, subjectName);
                            preparedStatement.setString(2, courseCode);

                            // Execute the query
                            preparedStatement.executeUpdate();

                            tf1.setText("");
                            tf2.setText("");
                            JOptionPane.showMessageDialog(f, "Subject added Successfully!");
                        }
                    } catch (SQLException exc) {
                        System.out.println("Database Exception Occurred: " + exc.getMessage());
                    }
                }
            } catch (Exception exc) {
                System.out.println("Exception Occurred: " + exc.getMessage());
            }
        } else if (e.getSource() == viewSubject) {
            String str = tf1.getText();

            if (str.length() > 0) {
                // JDBC connection parameters
                String url = "jdbc:mysql://localhost:3306/school";
                String username = "ahsan";
                String password = "ahsan";

                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // SQL query to select subject data based on subject name or course code
                    String sql = "SELECT * FROM subjects WHERE subject_name = ? OR course_code = ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                        // Set values for the prepared statement
                        preparedStatement.setString(1, str);
                        preparedStatement.setString(2, str);

                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
                            if (resultSet.next()) {
                                // Display the subject information
                                String subjectName = resultSet.getString("subject_name");
                                String courseCode = resultSet.getString("course_code");

                                String newLine = "Subject: " + subjectName + "\nCourse: " + courseCode;
                                tf1.setText("");
                                JOptionPane.showMessageDialog(f, newLine);
                            } else {
                                JOptionPane.showMessageDialog(f, str + " is an invalid value!!");
                                tf1.setText("");
                            }
                        }
                    }
                } catch (SQLException exc) {
                    System.out.println("Database Exception Occurred: " + exc.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(f, "Enter a value!!");
            }
        } else if (e.getSource() == deleteSubject) {
            String wordToDelete = tf1.getText();

            if (wordToDelete.length() > 0) {
                // JDBC connection parameters
                String url = "jdbc:mysql://localhost:3306/school";
                String username = "ahsan";
                String password = "ahsan";

                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // SQL query to delete subject data based on subject name or course code
                    String sql = "DELETE FROM subjects WHERE subject_name = ? OR course_code = ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                        // Set values for the prepared statement
                        preparedStatement.setString(1, wordToDelete);
                        preparedStatement.setString(2, wordToDelete);

                        int rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) {
                            tf1.setText("");
                            JOptionPane.showMessageDialog(f, "Record Deleted Successfully");
                        } else {
                            JOptionPane.showMessageDialog(f, "Subject not found. No record deleted.");
                        }
                    }
                } catch (SQLException exc) {
                    System.out.println("Database Exception Occurred: " + exc.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(f, "Enter a value!!");
            }
        } else if (e.getSource() == updateSubject) {
    try {
        String oldCourseCode = tf1.getText();
        String newSubjectName = tf2.getText();
        String newCourseCode = tf3.getText();

        if (oldCourseCode.length() == 0 || newSubjectName.length() == 0 || newCourseCode.length() == 0) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            JOptionPane.showMessageDialog(f, "Insert all values!");
        } else {
            // JDBC connection parameters
            String url = "jdbc:mysql://localhost:3306/school";
            String username = "ahsan";
            String password = "ahsan";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                // SQL query to update subject data based on old course code
                String sql = "UPDATE subjects SET subject_name = ?, course_code = ? WHERE course_code = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    // Set values for the prepared statement
                    preparedStatement.setString(1, newSubjectName);
                    preparedStatement.setString(2, newCourseCode);
                    preparedStatement.setString(3, oldCourseCode);

                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        tf1.setText("");
                        tf2.setText("");
                        tf3.setText("");
                        JOptionPane.showMessageDialog(f, "Record Updated Successfully");
                    } else {
                        JOptionPane.showMessageDialog(f, "Subject not found. No record updated.");
                    }
                }
            } catch (SQLException exc) {
                System.out.println("Database Exception Occurred: " + exc.getMessage());
            }
        }
    } catch (Exception exc) {
        System.out.println("Exception Occurred: " + exc.getMessage());
    }
}

    }
}

class teacher implements ActionListener {

    private JFrame frame = new JFrame("Teacher Menu");
    private JButton viewSubject;
    private subject sbj = new subject();

    teacher() {
        viewSubject = new JButton("View Subject");

        // Create the layout manager
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Center the button both horizontally and vertically
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding
        frame.add(viewSubject, gbc);

        viewSubject.addActionListener(this);

        // Set frame properties
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewSubject) {
            sbj.viewSubjectUI();
        }
    }
}

class Principal implements ActionListener {

    private JFrame frame = new JFrame("Principal Menu");
    private JButton registerStudents, viewStudents, deleteStudents, updateStudents;
    private JButton addSubject, viewSubject, deleteSubject, updateSubject;
    private student s = new student();
    private subject sbj = new subject();

    Principal() {
        registerStudents = new JButton("Register Student");
        viewStudents = new JButton("View Student");
        deleteStudents = new JButton("Delete Student");
        updateStudents = new JButton("Update Student");

        addSubject = new JButton("Add Subject");
        viewSubject = new JButton("View Subject");
        deleteSubject = new JButton("Delete Subject");
        updateSubject = new JButton("Update Subject");

        frame.setLayout(new GridLayout(10, 1));

        // Add components to the frame
        frame.add(new JLabel("Student Section"));
        frame.add(registerStudents);
        frame.add(viewStudents);
        frame.add(deleteStudents);
        frame.add(updateStudents);

        frame.add(new JLabel("Subject Section"));
        frame.add(addSubject);
        frame.add(viewSubject);
        frame.add(deleteSubject);
        frame.add(updateSubject);

        // Add action listeners for buttons
        registerStudents.addActionListener(this);
        viewStudents.addActionListener(this);
        deleteStudents.addActionListener(this);
        updateStudents.addActionListener(this);

        addSubject.addActionListener(this);
        viewSubject.addActionListener(this);
        deleteSubject.addActionListener(this);
        updateSubject.addActionListener(this);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the action event for the buttons
        if (e.getSource() == registerStudents) {
            s.registerStudentUI();
//            JOptionPane.showMessageDialog(null, "Register Students button clicked!");
        } else if (e.getSource() == viewStudents) {
            s.viewStudentUI();
        } else if (e.getSource() == deleteStudents) {
            s.deleteStudentUI();
        } else if (e.getSource() == updateStudents) {
            s.updateStudentUI();
        } else if (e.getSource() == addSubject) {
            sbj.addSubjectUI();
        } else if (e.getSource() == viewSubject) {
            sbj.viewSubjectUI();
        } else if (e.getSource() == deleteSubject) {
            sbj.deleteSubjectUI();
        } else if (e.getSource() == updateSubject) {
            sbj.updateSubjectUI();
        }
    }
}

public class SchoolManagementSystem implements ActionListener {

    private JFrame frame = new JFrame("School Management System");
    private JButton teacherButton, principalButton;
    private teacher t;
    private subject sbj = new subject();

    SchoolManagementSystem() {
        teacherButton = new JButton("Teacher");
        principalButton = new JButton("Principal");

        frame.setLayout(new GridLayout(2, 1));

        // Add components to the frame
        frame.add(teacherButton);
        frame.add(principalButton);

        // Add action listeners for buttons
        teacherButton.addActionListener(this);
        principalButton.addActionListener(this);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the action event for the buttons
        if (e.getSource() == teacherButton) {
            new teacher();
        } else if (e.getSource() == principalButton) {
            new Principal();
        }
    }

    public static void main(String[] args) {
        new SchoolManagementSystem();
    }
}
