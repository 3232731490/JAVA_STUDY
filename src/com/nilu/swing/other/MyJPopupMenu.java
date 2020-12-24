package com.nilu.swing.other;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJPopupMenu {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);

       final JPanel jPanel=new JPanel();

       final JPopupMenu jPopupMenu=new JPopupMenu();
        JMenu jMenu1=new JMenu("文件");
        JMenu jMenu2=new JMenu("编辑");
        JMenu jMenu3=new JMenu("视图");
        JMenu jMenu4=new JMenu("帮助");
       jPopupMenu.add(jMenu1);
       jPopupMenu.add(jMenu2);
       jPopupMenu.add(jMenu3);
       jPopupMenu.add(jMenu4);
      jPanel.add(jPopupMenu);
        MouseListener actionListener=new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.isMetaDown())
                {
                    jPopupMenu.show(jPanel,e.getX(),e.getY());
                }else{
                    jPopupMenu.setVisible(false);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        jPanel.addMouseListener(actionListener);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
