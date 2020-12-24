package com.nilu.swing.layout;

import javax.swing.*;

public class Absolute {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("BorderLayout");
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //null表示绝对布局
        JPanel jPanel=new JPanel(null);

        JButton btn_1=new JButton("btn_1");
        btn_1.setLocation(200,100);
        btn_1.setSize(80,60);
        jPanel.add(btn_1);

        JButton btn_2=new JButton("btn_2");
        btn_2.setBounds(100,200,80,80);
        jPanel.add(btn_2);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);

        JButton btn_3=new JButton("btn_3");
        btn_3.setBounds(jPanel.getWidth()-100,jPanel.getHeight()-50,100,50);
        jPanel.add(btn_3);
    }
}
