package com.nilu.swing.other;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFileChooser {
    public static void main(String[] args) {
       final JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel();
       final JFileChooser jFileChooser=new JFileChooser(".");
        jFileChooser.setCurrentDirectory(new File("D:"+ File.separator+"C++课程设计"));
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser.setMultiSelectionEnabled(false);

        JButton jButton=new JButton("打开文件");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=jFileChooser.showOpenDialog(jFrame);
                if(result==JFileChooser.APPROVE_OPTION)
                {
                    File files=jFileChooser.getSelectedFile();
                    System.out.println(files.getAbsolutePath());
                }
            }
        });

        jPanel.add(jButton);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
