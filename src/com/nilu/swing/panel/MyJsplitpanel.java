package com.nilu.swing.panel;

import javax.swing.*;
import java.awt.*;

public class MyJsplitpanel {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JTabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(new BorderLayout());

        JSplitPane jSplitPane=new JSplitPane();
        jSplitPane.setLeftComponent(new JButton("左边控件"));
        jSplitPane.setRightComponent(new JButton("右边控件"));
        jSplitPane.setDividerLocation(300);
        jSplitPane.setDividerSize(30);
        jSplitPane.setContinuousLayout(true);
        jSplitPane.setOneTouchExpandable(true);
        jSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);

        jPanel.add(jSplitPane,BorderLayout.CENTER);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
