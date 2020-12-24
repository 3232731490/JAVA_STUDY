package com.nilu.swing.other;

import javax.swing.*;
import java.awt.*;

public class MyToolBar {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel(new BorderLayout());

        JToolBar jToolBar=new JToolBar("工具栏");
        JButton jButton1=new JButton("btn_1");
        JButton jButton2=new JButton("btn_2");
        JButton jButton3=new JButton("btn_3");

        jToolBar.add(jButton1);
        jToolBar.add(jButton2);
        jToolBar.add(jButton3);

        jPanel.add(jToolBar,BorderLayout.NORTH);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
