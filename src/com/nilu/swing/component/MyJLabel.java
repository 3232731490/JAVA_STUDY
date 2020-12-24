package com.nilu.swing.component;

import javax.swing.*;
import java.awt.*;

public class MyJLabel {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,800);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);
        JLabel jLabel=new JLabel("风景 1");
        jLabel.setFont(new Font("楷体",Font.BOLD,12));
        jLabel.setIcon(new ImageIcon("image/photo_3.jpg"));
        jLabel.setBounds(100,100,500,600);
        jLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        jLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        jPanel.add(jLabel);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
