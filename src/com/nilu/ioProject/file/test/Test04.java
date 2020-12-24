package com.nilu.ioProject.file.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入一串数字字符串");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNext("\\d+"))
        {
            String str=sc.next();
            String num[]=str.split("");
            int results[]=new int[num.length];
            int countD=0;
            int countO=0;
            for (int i = 0; i < results.length; i++) {
                results[i]=Integer.parseInt(num[i]);
                if(results[i]%2==0)
                {
                    countD++;
                }
                else
                {
                    countO++;
                }
            }
            System.out.println("奇数共有： "+countO);
            System.out.println("偶数共有： "+countD);
        }
        else
        {
            System.out.println("您输入的字符串不符合标准");
        }
    }
}
