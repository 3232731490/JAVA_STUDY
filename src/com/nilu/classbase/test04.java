package com.nilu.classbase;

import java.util.Random;

public class test04 {
    public static void main(String[] args) {
        int count0=0,count1=0;
        Random R=new Random();
        for (int i = 0; i < 1000; i++) {
            int temp=R.nextInt(2);
            if(temp==1)
            {
                count1++;
            }
            else
            {
                count0++;
            }
        }
        System.out.println("正面数： "+count1);
        System.out.println("反面数： "+count0);
    }
}
