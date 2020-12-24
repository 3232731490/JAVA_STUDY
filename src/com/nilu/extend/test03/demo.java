package com.nilu.extend.test03;

public class demo {
    public static void main(String[] args) {
        String str="want you to know one thing";
        CharNum ch=new CharNum();
        ch.acountChar(str);
        System.out.println("字母 n 有 "+CharNum.getNumn() +" 个");
        System.out.println("字母 o 有 "+CharNum.getNumo() +" 个");
    }
}
