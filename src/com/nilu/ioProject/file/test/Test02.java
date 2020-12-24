package com.nilu.ioProject.file.test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入三个字符串");
        StringBuffer str=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        String temp=null;
        for(int i=0;i<3;i++)
        {
            temp=sc.next();
            str.append(temp);
        }
        str.reverse();
        System.out.println(str);
        sc.close();
    }
}

