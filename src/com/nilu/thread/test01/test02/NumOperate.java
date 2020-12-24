package com.nilu.thread.test01.test02;
public class NumOperate implements Runnable{
    private Resouce res;
    public NumOperate(Resouce res) {
        this.res = res;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            res.sub();
        }
    }
}
