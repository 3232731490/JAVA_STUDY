package com.nilu.swing.other;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

public class MyIInternalFreme {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);

        JMenuBar jMenuBar=new JMenuBar();
        JMenu jMenu=new JMenu("打开");
        jMenuBar.add(jMenu);
        JMenuItem jMenuItem=new JMenuItem("打开内部窗口");
        jMenu.add(jMenuItem);

       final JDesktopPane jDesktopPane=new JDesktopPane();

        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame jInternalFrame=showInFrame(jFrame);
                jDesktopPane.add(jInternalFrame);
                try {
                    jInternalFrame.setSelected(true);
                } catch (PropertyVetoException propertyVetoException) {
                    propertyVetoException.printStackTrace();
                }
            }
        });
        jFrame.setJMenuBar(jMenuBar);
        jFrame.setContentPane(jDesktopPane);
        jFrame.setVisible(true);
    }
    public static JInternalFrame showInFrame(JFrame jf)
    {
        JInternalFrame jInternalFrame=new JInternalFrame("内部窗口",false,true,false);
        jInternalFrame.setLocation(100,100);
        jInternalFrame.setSize(200,150);
        JLabel jLabel=new JLabel("内部窗口");
        JButton btn=new JButton("关闭窗口");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=JOptionPane.showConfirmDialog(jInternalFrame,"确定要关闭吗？","关闭窗口",JOptionPane.YES_NO_OPTION);
                if(result==JOptionPane.YES_OPTION)
                {
                    jInternalFrame.dispose();
                }else
                {
                    System.out.println("已撤销操作");
                }
            }
        });
       JPanel jPanel=new JPanel();
        jPanel.add(jLabel);
        jPanel.add(btn);
       //将面板添加至内部窗口
       jInternalFrame.setContentPane(jPanel);
       jInternalFrame.setVisible(true);
        return jInternalFrame;

    }
}
