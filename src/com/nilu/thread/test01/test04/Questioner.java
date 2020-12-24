package com.nilu.thread.test01.test04;
public class Questioner implements Runnable{
    private Resource res;

    public Questioner(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        res.question();
    }
}
