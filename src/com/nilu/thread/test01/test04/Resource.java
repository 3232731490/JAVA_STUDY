package com.nilu.thread.test01.test04;

import java.util.Random;

public class Resource {
    private boolean flag=false;
    //true--可以抢答
    //false--等待指令
    public synchronized void question()
    {
        Random r=new Random();
        int time=r.nextInt(20000)+1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("请开始抢答...");
        flag=true;
    }

    public boolean isFlag() {
        return flag;
    }

    public synchronized void respond()
    {
        if(flag==false)
        {
            try {
                System.out.println(Thread.currentThread().getName()+"抢答失败...");
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"抢答成功...");
        flag=false;
        super.notifyAll();
    }
}
