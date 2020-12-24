package com.nilu.thread.test01.test02;

public class Demo {
    public static void main(String[] args) {
       Resouce res=new Resouce();
       NumOperate num1=new NumOperate(res);
       NumOperate2 num2=new NumOperate2(res);
        new Thread(num1,"减法线程 - A").start();
        new Thread(num1,"减法线程 - B").start();
        new Thread(num2,"加法线程 - X").start();
        new Thread(num2,"加法线程 - Y").start();
    }
}
