package com.nilu.ioProject.file;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入年龄： ");
        String msg=input.readLine();
        if(msg.matches("\\d{1,3}"))
        {
            System.out.println("您的年龄： "+msg);
        }
        else
        {
            System.out.println("您的输入有误");
        }
    }
}
