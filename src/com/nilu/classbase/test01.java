package com.nilu.classbase;

public class test01 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        for(int i=97;i<=122;i++)
        {
            str.append((char)i);
        }
        str.reverse();
        System.out.println(str);
    }
}
