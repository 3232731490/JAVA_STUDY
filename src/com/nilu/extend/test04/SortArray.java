package com.nilu.extend.test04;

public class SortArray extends Array{
    public SortArray(int len)
    {
        super(len);
    }
    public void sortArray()
    {
         java.util.Arrays.sort(getData());
    }
}
