package com.nilu.String;

import java.util.Arrays;
import java.util.Scanner;

public class Stringclass {
    public static void main(String[] args) {
        int []arrays=new int []{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arrays));

        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数");
        int num=sc.nextInt();
        System.out.println("数字是: "+num);
    }

}
