package com.nilu.extend.test03;

public class CharNum {
    private static int numn=0;
    private static int numo=0;

    public static int getNumn() {
        return numn;
    }

    public static int getNumo() {
        return numo;
    }

    public void acountChar(String str)
    {
        char[] C = str.toCharArray();
        for (int i = 0; i < C.length; i++) {
            if(C[i]=='n')
            {
                numn++;
            }
            else if(C[i]=='o')
            {
                numo++;
            }
            else
            {
                continue;
            }
        }
    }
}
