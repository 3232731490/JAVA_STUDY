package com.nilu.swing.panel;

import javax.swing.*;
import java.awt.*;

public class MyJScrollpanel {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JTabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);

        JScrollPane jScrollPane=new JScrollPane();
        jScrollPane.setBounds(100,100,200,200);

        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JTextArea jTextArea=new JTextArea();
        jScrollPane.add(jTextArea);
        jTextArea.setBounds(0,0,200,300);

        jPanel.add(jScrollPane);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
