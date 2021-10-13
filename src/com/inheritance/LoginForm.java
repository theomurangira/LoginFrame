package com.inheritance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    JLabel lWelcome;
    JLabel lUsername;
    JLabel lPassword;
    JTextField textUserName;
    JPasswordField textPassword;
    JButton loginButton;
    JButton clearButton;
    Container container;
    public void initializeComponents()
    {
        lWelcome=new JLabel("Welcome to SJH");
        lWelcome.setBounds(20,0,600,100);
        lWelcome.setBackground(Color.green);
        lWelcome.setFont(new Font("Tacoma",0,14));
        lUsername =new JLabel("User Name");
        lUsername.setBounds(20,140,150,60);
        lPassword=new JLabel("Password");
        lPassword.setBounds(20,260,150,60);
        textUserName=new JTextField();
        textUserName.setBounds(190,120,600,60);
        textPassword=new JPasswordField();
        textPassword.setBounds(190,260,600,60);
        loginButton=new JButton("Login");
        loginButton.setBounds(100,540,200,120);
        loginButton.addActionListener(this);
        clearButton= new JButton("Clear");
        clearButton.setBounds(340,540,200,60);
        clearButton.addActionListener(this);
        container=this.getContentPane();
    }
    public void addComponents()
    {
        container.add(lWelcome);
        container.add(lUsername);
        container.add(lPassword);
        container.add(textUserName);
        container.add(textPassword);
        container.add(loginButton);
        container.add(clearButton);
        this.setContentPane(container);
    }
    public LoginForm()
    {
        initializeComponents();
        addComponents();
        this.setLayout(null);
        this.setBounds(0,0,700,700);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton)
        {
            JOptionPane.showMessageDialog(this,"Login Buttonclicked");
        }
        if(e.getSource()==clearButton)
        {
            textUserName.setText("");
            textPassword.setText("");

        }

    }
}
