package com.nilu.classbase;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        String regex="\\d+@\\w+\\.com";
        String str1=new String();
        Scanner sc=new Scanner(System.in);
        str1=sc.next();
        System.out.println(str1.matches(regex));
    }
}
