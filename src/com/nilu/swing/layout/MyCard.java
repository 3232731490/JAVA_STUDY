package com.nilu.swing.layout;

import javax.swing.*;
import java.awt.*;

public class MyCard {
    public static void main(String[] args) {
        JFrame jf=new JFrame("GridLayout");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(400,300);
        final CardLayout cardLayout=new CardLayout();
        final JPanel jPanel=new JPanel(cardLayout);
        JButton btn1=new JButton("JButton_1");
        JButton btn2=new JButton("JButton_2");
        JButton btn3=new JButton("JButton_3");

        jPanel.add(btn1,"btn_1");
        jPanel.add(btn2,"btn_2");
        jPanel.add(btn3,"btn_3");
        new Thread(()->{
            while(true) {
                try {
                    Thread.sleep(1000);  //隔一秒显示下一张卡片
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cardLayout.next(jPanel);
            }
        }).start();
        jf.setContentPane(jPanel);
        jf.setVisible(true);
    }
}
