package com.nilu.classbase;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        System.out.println("请输入您的选择...");
        System.out.println("1、 中文   |   1、  英文");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Locale CH_L=new Locale("zh","CN");
        Locale US_L=new Locale("en","US");
        switch (choice)
        {
            case 1:
            {
                ResourceBundle res=ResourceBundle.getBundle("com.nilu.classbase.Message_ZH_CN",CH_L);
                System.out.println(res.getString("info"));
                break;
            }
            case 2:
            {
                ResourceBundle res=ResourceBundle.getBundle("com.nilu.classbase.Message_en_US",US_L);
                System.out.println(res.getString("info"));
                break;
            }
            default:
            {
                System.out.println("您的输入有误...");
            }
        }
    }
}
