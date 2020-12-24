package com.nilu.swing.component;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MyList {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JLabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(null);

        JList<String> jList=new JList<>();
        jList.setBounds(100,100,100,100);
        String []str=new String[]{"nilu","lihui","yang","boa","sheng","lala","lulu"};
        jList.setListData(str);
        jList.setSelectedIndex(1);
        jList.setSelectionForeground(Color.CYAN);
        JScrollPane jScrollPane=new JScrollPane(jList);
        jScrollPane.setBounds(100,100,100,100);
        jPanel.add(jScrollPane);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
