package com.ui;

import javax.swing.*;

public class App extends JFrame {

    private JPanel panel;
    private JTextField textField1;
    private JButton button1;
    private JCheckBox activoCheckBox;
    private JComboBox<String> comboBox1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JTextField textField4;
    private JButton nuevoButton;

    public App() {
        this.setTitle("Registro de usuarios");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(750, 260);
        this.setResizable(false);
        this.setVisible(true);
        this.setContentPane(panel);
        this.comboBox1.addItem("Administrador");
    }

    public static void main(String[] args) {
        App app = new App();
    }

}
