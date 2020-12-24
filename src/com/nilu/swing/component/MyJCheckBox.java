package com.nilu.swing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJCheckBox {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel();

        JCheckBox jCheckBox1=new JCheckBox("nilu");
        JCheckBox jCheckBox2=new JCheckBox("lihui");
        JCheckBox jCheckBox3=new JCheckBox("yang");
        JCheckBox jCheckBox4=new JCheckBox("bao");
        JCheckBox jCheckBox5=new JCheckBox("sheng");
        jCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox jCheckBox=(JCheckBox) e.getSource();
                if(jCheckBox.isSelected()){
                    System.out.println("选择了： "+jCheckBox.getText());
                }else {
                    System.out.println("取消选择了： "+jCheckBox.getText());
                }
            }
        });

        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);
        jPanel.add(jCheckBox3);
        jPanel.add(jCheckBox4);
        jPanel.add(jCheckBox5);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
