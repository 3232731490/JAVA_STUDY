package com.nilu.reflect;


import java.lang.reflect.InvocationTargetException;

class Member{
    private String name;
    private int age;
    public void send()
    {
        System.out.println("***************");
    }
}
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /**
         * 通过反射实例化对象
         */
        Class<?> clazz= Member.class;
        Object obj=clazz.getDeclaredConstructor().newInstance();
        Member member=(Member)obj;
        member.send();
    }
}
