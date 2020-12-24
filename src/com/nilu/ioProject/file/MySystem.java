package com.nilu.ioProject.file;

import java.io.IOException;
import java.io.InputStream;

public class MySystem {
    public static void main(String[] args) {
        InputStream input=System.in;
        byte[] data=new byte[1024];
        try {
            int len=input.read(data);
            System.out.println("输入的数据： "+new String(data,0,len));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e);
        }
    }
}
