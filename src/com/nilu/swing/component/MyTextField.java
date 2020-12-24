package com.nilu.swing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel(null);

        JTextField jTextField=new JTextField();
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField temp=(JTextField)e.getSource();
                System.out.println(temp.getText());
            }
        });

        jTextField.setColumns(20);
        jTextField.setFont(new Font("楷体",Font.PLAIN,20));
        jTextField.setBounds(300,300,80,30);
        jTextField.setHorizontalAlignment(JTextField.LEFT);
        jPanel.add(jTextField);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
