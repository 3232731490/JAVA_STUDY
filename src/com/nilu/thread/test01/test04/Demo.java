package com.nilu.thread.test01.test04;

public class Demo {
    public static void main(String[] args) {
        Resource res=new Resource();
        Questioner Q=new Questioner(res);
        Responder R1=new Responder(res);
        Responder R2=new Responder(res);
        Responder R3=new Responder(res);
        new Thread(Q).start();
        new Thread(R1,"竞赛者1").start();
        new Thread(R2,"竞赛者2").start();
        new Thread(R3,"竞赛者3").start();

    }
}
