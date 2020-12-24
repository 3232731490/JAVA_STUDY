package com.nilu.extend.test04;

public class Array {
    private int [] data;
    private int foot;

    public Array(int len)
    {
        data =new int[len];
    }
    public boolean increase(int num)
    {
        if(foot<data.length)
        {
            data[foot++]=num;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void expansion(int num)
    {
        int [] newdata=new int [this.data.length+num];
        System.arraycopy(data,0,newdata,0,data.length);
        this.data=newdata;
    }
    public int[] getData()
    {
        return this.data;
    }
    public void PrintArray()
    {
        for (int i = 0; i < foot; i++) {
            System.out.println(data[i]);
        }
    }
    public int getFoot()
    {
        return foot;
    }
}
