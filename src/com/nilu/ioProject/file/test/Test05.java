package com.nilu.ioProject.file.test;

import java.util.Scanner;

public class Test05 {
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入账号：");
            String admin = sc.next();
            System.out.println("请输入密码：");
            String key = sc.next();
            if ("admin".equals(admin) && "hello".equals(key)) {
                System.out.println("登陆成功");
                break;
            } else {
                if(++count==3)
                {
                    System.out.println("您输入错误次数过多，已退出系统");
                    break;
                }
                System.out.println("账号或密码错误，请重新登录");
                System.out.println("您还有"+(3-count)+"次输入机会");
                continue;
            }
        }
    }
}
