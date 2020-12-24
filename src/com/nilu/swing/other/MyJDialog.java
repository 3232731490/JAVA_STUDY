package com.nilu.swing.other;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJDialog {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel=new JPanel();
        Box box=Box.createVerticalBox();
        /**
         * 消息对话框
         */
        JButton jButton1=new JButton("普通消息对话框");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame,"她还是那样","消息对话框",JOptionPane.INFORMATION_MESSAGE);
            }
        });


        /**
         * 警告消息对话框
         */
        JButton jButton2=new JButton("警告消息对话框");
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame,"别继续了","消息对话框",JOptionPane.WARNING_MESSAGE);
            }
        });

        /**
         * 确认对话框
         */
        JButton jButton3=new JButton("确认对话框");
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice=JOptionPane.showConfirmDialog(jFrame,"继续会很难受的","确认对话框",JOptionPane.YES_NO_OPTION);
                if(choice==JOptionPane.YES_OPTION)
                {
                    System.out.println("你tm是个傻逼");
                }else{
                    System.out.println("明智的选择");
                }
            }
        });

        /**
         * 输入对话框（文本框）
         */
        JButton jButton4=new JButton("输入对话框1");
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String data= JOptionPane.showInputDialog(jFrame,"说说你现在还爱她吗？","输入： ",JOptionPane.PLAIN_MESSAGE);
                System.out.println("你选的：” "+data+" ”,阿sir");
            }
        });

        /**
         * 输入对话框（下拉框输入）
         */
        JButton jButton5=new JButton("输入对话框2");
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object []content=new Object[]{"L","i","H","u","i"};
                Object data= JOptionPane.showInputDialog(jFrame,"请选择","。。。",JOptionPane.PLAIN_MESSAGE,
                        null,
                       content,content[0]);
                System.out.println(data);
            }
        });

        /**
         * 选项对话框
         */
        JButton jButton6=new JButton("选项对话框");
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object []content=new Object[]{"L","i","H","u","i"};
                int data= JOptionPane.showOptionDialog(jFrame,"请选择","。。。",JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        /* new ImageIcon("image/photo_3.jpg")*/
                        null,content,content[0]);
                if(data>=0){
                System.out.println(content[data]);
                }
            }
        });

        JButton jButton7=new JButton("自定义对话框");
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMyDialog(jFrame);
            }
        });
        box.add(jButton1);
        box.add(jButton2);
        box.add(jButton3);
        box.add(jButton4);
        box.add(jButton5);
        box.add(jButton6);
        box.add(jButton7);
        jPanel.add(box);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
public static void showMyDialog(JFrame jf)
{
    final JDialog jDialog=new JDialog(jf,"自定义对话框",true);
    jDialog.setSize(200,100);

    JLabel jLabel=new JLabel("有点东西");
    JButton jButton=new JButton("关闭对话框");
    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int choice=JOptionPane.showConfirmDialog(jDialog,"确认关闭吗","确认对话框",JOptionPane.YES_NO_OPTION);
            if(choice==JOptionPane.YES_OPTION)
            {
                jDialog.dispose();
            }else{
                System.out.println("已取消操作");
            }
        }
    });
    JPanel jPanel=new JPanel();
    jPanel.add(jLabel);
    jPanel.add(jButton);
    jDialog.setLocationRelativeTo(jf);
    jDialog.setContentPane(jPanel);
    jDialog.setVisible(true);
}

}
