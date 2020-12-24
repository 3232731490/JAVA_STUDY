package com.nilu.swing.other;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyBorder {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel();
        JLabel jLabel=new JLabel("Test");
      
        jPanel.add(jLabel);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
