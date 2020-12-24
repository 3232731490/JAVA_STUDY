package com.nilu.swing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPasswordField {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);
        JLabel jLabel1 =new JLabel("请输入账号：");
        jLabel1.setBounds(100,100,80,40);
      final  JTextField jTextField=new JTextField();
        jTextField.setBounds(180,100,80,40);
        JLabel jLabel3=new JLabel("请输入密码：");
        jLabel3.setBounds(100,150,80,40);
       final JPasswordField jPasswordField2 =new JPasswordField();
        jPasswordField2.setBounds(180,150,80,40);
        jPasswordField2.setEchoChar('*');
        JButton jButton=new JButton("登录");
        jButton.setBounds(150,200,80,40);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextField.getText().equals("3232731490")&&jPasswordField2.getText().equals("20021112nl"))
                {
                    System.out.println("登录成功");
                }else{
                    System.out.println("账号或密码错误");
                }
            }

        });
        jPanel.add(jLabel1);
        jPanel.add(jTextField);
        jPanel.add(jLabel3);
        jPanel.add(jPasswordField2);
        jPanel.add(jButton);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
