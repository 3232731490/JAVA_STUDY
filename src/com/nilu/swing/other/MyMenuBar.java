package com.nilu.swing.other;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuBar {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        JPanel jPanel=new JPanel(new BorderLayout());
        JMenuBar jMenuBar=new JMenuBar();
        JMenu jMenu1=new JMenu("文件");
        JMenu jMenu2=new JMenu("编辑");
        JMenu jMenu3=new JMenu("视图");
        JMenu jMenu4=new JMenu("帮助");
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        jMenuBar.add(jMenu3);
        jMenuBar.add(jMenu4);

        JMenuItem jMenuItem1=new JMenuItem("新建");
        JMenuItem jMenuItem2=new JMenuItem("保存");
        JMenuItem jMenuItem3=new JMenuItem("复制");
        JMenuItem jMenuItem4=new JMenuItem("清空");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        jMenu1.add(jMenuItem4);
        final JTextArea jTextArea=new JTextArea();
        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("");
            }
        });
        jPanel.add(jMenuBar,BorderLayout.NORTH);
        jPanel.add(jTextArea,BorderLayout.CENTER);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
