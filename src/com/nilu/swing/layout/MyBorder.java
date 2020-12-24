package com.nilu.swing.layout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyBorder {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("BorderLayout");
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel=new JPanel(new BorderLayout());

        JButton but_North=new JButton("but_North");
        JButton but_South=new JButton("but_South");
        JButton but_West=new JButton("but_West");
        JButton but_East=new JButton("but_East");
        JButton but_Center=new JButton("but_Center");

        jPanel.add(but_Center, BorderLayout.CENTER);
        jPanel.add(but_North, BorderLayout.NORTH);
        jPanel.add(but_South, BorderLayout.SOUTH);
        jPanel.add(but_West, BorderLayout.WEST);
        jPanel.add(but_East, BorderLayout.EAST);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);


    }
}
