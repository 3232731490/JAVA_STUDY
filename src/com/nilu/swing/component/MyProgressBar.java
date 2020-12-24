package com.nilu.swing.component;

import javax.swing.*;

public class MyProgressBar {
    static int variation=0;
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);

       final JProgressBar jProgressBar=new JProgressBar();
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setBounds(300,300,100,40);
        jProgressBar.setStringPainted(true);
        jProgressBar.setBorderPainted(true);
        new Thread(()->{
            while(true)
            {
                try {
                    Thread.sleep(500);
                    variation+=2;
                    if(variation>100)
                    {
                        variation=0;
                    }
                    jProgressBar.setValue(variation);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        jPanel.add(jProgressBar);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
