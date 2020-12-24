package com.nilu.classbase;

import java.util.Random;

public class test02 {
    public static void main(String[] args) {
        Random R=new Random();
        int []d=new int[5];
        for (int i = 0; i < 5; i++) {
            int temp=R.nextInt(30)+1;
            d[i]=temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(d[i]);
        }
    }
}
