package com.nilu.thread.test01.test02;

public class Resouce {
    private int num=0;
    private boolean flag=true;
    //真表示可以进行加法运算，不能进行减法运算
    //假表示可以进行减法运算，不能进行加法运算
    public synchronized void sub() {
        if(this.flag==true)
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
        this.num--;
        System.out.println(Thread.currentThread().getName()+"进行了一次减法...num= "+this.num);
        this.flag=true;
        super.notifyAll();
   }
    public synchronized void add() {
       if(this.flag==false)
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
        this.num++;
        System.out.println(Thread.currentThread().getName()+"进行了一次加法...num= "+this.num);
        this.flag=false;
        super.notifyAll();
    }
}
