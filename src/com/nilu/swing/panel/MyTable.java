package com.nilu.swing.panel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class MyTable {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JTabel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,700);
        jFrame.setLocationRelativeTo(null);
        JPanel jPanel=new JPanel(new BorderLayout());

        Object []Header=new Object[]{"姓名","年龄","成绩"};
        Object [][]table=new Object[][]{
                {"nilu",18,100},{"lihui",19,99},{"yang",20,98}
        };
        DefaultTableModel defaultTableModel=new DefaultTableModel(table,Header);
        JTable jTable=new JTable(defaultTableModel);
        //JTable jTable=new JTable(table,Header);
        jTable.setBounds(100,100,100,100);
        jTable.setShowGrid(true);
        jTable.setSelectionForeground(Color.CYAN);
        jTable.setRowHeight(3,3);


        jPanel.add(jTable.getTableHeader(),BorderLayout.NORTH);
        jPanel.add(jTable,BorderLayout.CENTER);
        jFrame.setContentPane(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
