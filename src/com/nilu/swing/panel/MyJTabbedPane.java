package com.nilu.swing.panel;

import javax.swing.*;

public class MyJTabbedPane {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JTabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);
        JLabel jLabel=new JLabel();
        JTabbedPane jTabbedPane=new JTabbedPane();
        jTabbedPane.addTab("显示按钮一",new JLabel("按钮一"));
        jTabbedPane.addTab("显示按钮二",new JLabel("按钮二"));
        //jTabbedPane.addTab("图片",new ImageIcon("image/photo_3.jpg"),jLabel,"photo");
        //jTabbedPane.setEnabledAt(2,false);
        jTabbedPane.setBounds(100,100,600,600);
        jPanel.add(jTabbedPane);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }

}
