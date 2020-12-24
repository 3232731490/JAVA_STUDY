package com.nilu.swing.component;

import javax.swing.*;

public class MyRadioButton {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,800);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel(null);

        JRadioButton jRadioButton_1=new JRadioButton("男");
        JRadioButton jRadioButton_2=new JRadioButton("女");
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(jRadioButton_1);
        btnGroup.add(jRadioButton_2);
        jRadioButton_1.setSelected(false);
        jRadioButton_1.setBounds(300,400,40,40);
        jRadioButton_2.setBounds(300,440,40,40);
        jPanel.add(jRadioButton_1);
        jPanel.add(jRadioButton_2);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
