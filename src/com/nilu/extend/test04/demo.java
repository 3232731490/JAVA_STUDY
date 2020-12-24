package com.nilu.extend.test04;

public class demo {
    public static void main(String[] args) {
        ReverseArray sort=new ReverseArray(10);
        sort.increase(10);
        sort.increase(20);
        sort.increase(70);
        sort.increase(40);
        sort.increase(50);
        sort.increase(60);
        sort.increase(80);
        sort.increase(90);
        sort.increase(100);
        sort.increase(30);
        sort.PrintArray();
        sort.ReverseMathod();
        System.out.println("===================");
        sort.PrintArray();
    }
}
