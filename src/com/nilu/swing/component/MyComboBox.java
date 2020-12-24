package com.nilu.swing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyComboBox {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);

        JComboBox<String> jComboBox=new JComboBox<>();
        jComboBox.setBounds(100,100,80,20);

        jComboBox.addItem("nilu");
        jComboBox.addItem("lihui");
        jComboBox.addItem("yang");
        jComboBox.addItem("bao");
        jComboBox.addItem("sheng");
        jComboBox.setSelectedIndex(1);
        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox source = (JComboBox) e.getSource();
                System.out.println("选中了： "+source.getSelectedItem());
            }
        });

        jPanel.add(jComboBox);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
