package com.nilu.adtractinterface.test01.test02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("请输入您要绘制的形状...");
        str=sc.next();
        Draw s=Fatory.shapeJudge(str);
       if(s!=null)
        s.draw();
       else
       {
           System.out.println("我不会绘制这个形状...");
       }
    }
}
