package com.nilu.swing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyToggleButton {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel(null);

        JToggleButton jToggleButton=new JToggleButton("显示");
        jToggleButton.setFont(new Font("楷体",Font.BOLD,18));
        jToggleButton.setBounds(100,100,80,40);
        final JLabel jLabel=new JLabel(new ImageIcon("image/photo_3.jpg"));
        jLabel.setBounds(100,150,500,500);
        jLabel.setVisible(false);
        jToggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JToggleButton temp=(JToggleButton) e.getSource();
                if(temp.isSelected())
                {
                    jLabel.setVisible(true);
                    temp.setText("隐藏");
                }else{
                    temp.setText("显示");
                    jLabel.setVisible(false);
                }

            }
        });
        jPanel.add(jToggleButton);
        jPanel.add(jLabel);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
