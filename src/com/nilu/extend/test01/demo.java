package com.nilu.extend.test01;

public class demo {
    public static void main(String[] args) {
        Student stu =new Student("倪路","内江",'男',18,138.0,118.0);
        System.out.println(stu.toString());
        Person per =new Person("李慧","安徽",'女',19);
        System.out.println(per.toString());
    }
}
