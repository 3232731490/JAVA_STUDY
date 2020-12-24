package com.nilu.extend.test04;

public class ReverseArray extends Array{
    public ReverseArray(int len)
    {
        super(len);
    }
    public void ReverseMathod()
    {
        int head=0;
        int foot=this.getFoot();
        while(head<foot)
        {
            int temp=getData()[foot-1];
            getData()[foot-1]=getData()[head];
            getData()[head]=temp;
            head++;
            foot--;
        }
    }
}
