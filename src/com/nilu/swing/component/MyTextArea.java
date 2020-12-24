package com.nilu.swing.component;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class MyTextArea {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(new BorderLayout());

        final JTextArea jTextArea=new JTextArea();
        jTextArea.setRows(8);
        jTextArea.setColumns(8);
        jTextArea.getLineWrap();
        jTextArea.setFont(new Font("宋体",Font.BOLD,18));
        jTextArea.setBounds(100,100,80,80);
        jTextArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("获得光标");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("失去光标");
            }
        });
        jTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println("输入："+e.getKeyChar());
            }
        });
        JPanel jPanel1=new JPanel();
        JLabel jLabel=new JLabel("输入：");
        JButton jButton=new JButton("录入：");
        final JTextField jTextField=new JTextField();
        jTextField.setSize(80,40);
        jPanel1.add(jLabel);
        jPanel1.add(jTextField);
        jPanel1.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data=jTextField.getText();
                jTextArea.append(data+"\n");
            }
        });
        jPanel.add(jTextArea, BorderLayout.CENTER);
        jPanel.add(jPanel1,BorderLayout.SOUTH);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
