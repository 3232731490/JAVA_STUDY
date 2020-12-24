package com.nilu.thread.test01;

public class Demo {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            String str="线程对象-"+i;
            new Thread(()->{
                for (int i1 = 0; i1 < 10; i1++) {
                    System.out.println(str+" "+i1);
                }
            } ).start();
        }

    }
}
