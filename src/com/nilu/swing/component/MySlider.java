package com.nilu.swing.component;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MySlider {
    public static void main(String[] args) {
            JFrame jFrame=new JFrame("JLabel");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(700,700);
            jFrame.setLocationRelativeTo(null);
            JPanel jPanel=new JPanel(null);

            JSlider jSlider=new JSlider(0,20,10);

            jSlider.setMajorTickSpacing(5);
            jSlider.setMinorTickSpacing(5);
            jSlider.setPaintTicks(true);
            jSlider.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    JSlider temp=(JSlider)e.getSource();
                    System.out.println("变化为： "+temp.getValue());
                }
            });
            jSlider.setBounds(100,100,200,100);
            jSlider.setPaintLabels(true);
            jPanel.add(jSlider);
            jFrame.setContentPane(jPanel);
            jFrame.setVisible(true);

    }
}
