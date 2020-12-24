package com.nilu.thread.test01.test03;

public class Process implements Runnable{
    private Computer computer;

    public Process(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            computer.yeildComputer();
        }
    }
}
