package com.nilu.swing.layout;

import javax.swing.*;
import java.awt.*;

public class Flow {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout(30));
        jf.setLocationRelativeTo(null);  //设置窗口居中
        JPanel jp=new JPanel();
        JButton button=new JButton("button-1");
        jp.add(button);
        jf.setContentPane(jp);
        jf.setVisible(true);
    }
}
