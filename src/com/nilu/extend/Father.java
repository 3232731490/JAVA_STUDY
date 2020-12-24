package com.nilu.extend;

public class Father {
   public void method(){
        System.out.println("Father 类method 调用");
    }

    public void handle()
    {
       method();
    }
}
