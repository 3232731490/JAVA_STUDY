package com.nilu.thread.test01.test04;

import java.util.concurrent.Callable;

public class Responder implements Runnable {
    private Resource res;

    public Responder(Resource res) {
        this.res = res;
    }
    @Override
    public void run() {
        res.respond();
    }
}
