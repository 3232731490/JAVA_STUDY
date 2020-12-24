package com.nilu.swing.layout;

import javax.swing.*;
import java.awt.*;

public class Grid {
    public static void main(String[] args) {
        JFrame jf=new JFrame("GridLayout");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(400,300);
        GridLayout gridLayout=new GridLayout(3,3,10,10);
        JPanel jPanel=new JPanel(gridLayout);
        for (int i = 0; i < 9; i++) {
            JButton button=new JButton("Button-"+(i+1));
            jPanel.add(button);
        }
        jf.setContentPane(jPanel);
        jf.setVisible(true);
    }
}
