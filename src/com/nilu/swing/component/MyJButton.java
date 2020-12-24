package com.nilu.swing.component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJButton {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,800);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);
        JButton jButton=new JButton("还爱着");
        jButton.setBounds(300,400,80,40);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("李慧");
            }
        });
        jPanel.add(jButton);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
