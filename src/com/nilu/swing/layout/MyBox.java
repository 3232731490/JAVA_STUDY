package com.nilu.swing.layout;

import javax.swing.*;

public class MyBox {
    public static void main(String[] args) {
        JFrame jf=new JFrame("GridLayout");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(400,300);
        Box hbox1=Box.createHorizontalBox();
        Box hbox2=Box.createHorizontalBox();
        JButton jb1=new JButton("Jbutton-1");
        JButton jb2=new JButton("Jbutton-2");
        JButton jb3=new JButton("Jbutton-3");
        JButton jb4=new JButton("Jbutton-4");
        JButton jb5=new JButton("Jbutton-5");
        hbox1.add(jb1);
        hbox1.add(jb2);
        hbox1.add(jb3);
        hbox2.add(jb4);
        hbox2.add(jb5);
        Box vbox=Box.createVerticalBox();
        vbox.add(hbox1);
        vbox.add(hbox2);
        jf.setContentPane(vbox);
        jf.pack();
        jf.setVisible(true);
    }
}
