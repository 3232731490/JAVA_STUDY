package com.nilu.thread.test01.test03;

public class Computer {
    private int num=0;//统计电脑生产出的数量
    private boolean flag=true;
    //flag=true----可以生产，不可以取走
    //flag=false---可以取走，不可以生产
    public synchronized void yeildComputer()
    {
        if(flag==false)
        {
            try {
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
        this.num++;
        System.out.println(Thread.currentThread().getName()+"生产了一台电脑...当前电脑总数： num= "+num);
        this.flag=false;
        super.notify();
    }
    public synchronized void FetchComputer()
    {
        if(flag==true)
        {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"取走了一台电脑...当前电脑总数： num= "+num);
        this.flag=true;
        super.notify();
    }
}
