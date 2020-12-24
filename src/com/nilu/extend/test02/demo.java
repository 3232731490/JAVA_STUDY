package com.nilu.extend.test02;

public class demo {
    public static void main(String[] args) {
        Generator Ge=new Generator("倪路",18,'男',"程序员",10000.0);
        System.out.println(Ge.toString());
        Emp emp=new Emp("李慧",19,'女');
        System.out.println(emp.toString());
    }
}
