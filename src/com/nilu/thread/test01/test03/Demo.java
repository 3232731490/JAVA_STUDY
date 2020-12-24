package com.nilu.thread.test01.test03;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Computer computer =new Computer();
        Process P=new Process(computer);
        FetchComputer F=new FetchComputer(computer);
        new Thread(P,"生产电脑流水线 ").start();
        new Thread(F,"取走电脑流水线 ").start();
    }
}
