package com.nilu.thread.test01.test02;

public class NumOperate2 implements Runnable{
  private Resouce res;
    //真表示可以进行加法运算，不能进行减法运算
    //假表示可以进行减法运算，不能进行加法运算
    public NumOperate2() {
    }
    public NumOperate2(Resouce res) {
        this.res = res;
    }
    @Override
    public void run() {
       for(int i=0;i<50;i++)
       {
           res.add();
    }
    }
}
