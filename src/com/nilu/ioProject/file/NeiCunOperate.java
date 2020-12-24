package com.nilu.ioProject.file;

import java.io.*;

public class NeiCunOperate {
    public static void main(String[] args) throws IOException {
        String str="nilu";
        InputStream input=new ByteArrayInputStream(str.getBytes());
        OutputStream output=new ByteArrayOutputStream();
        int data=0;
        while((data=input.read())!=-1)
        {
            output.write(Character.toUpperCase(data));
        }
        System.out.println(output);
        input.close();
        output.close();

        //获取系统默认编码
        System.out.println("系统默认编码："+System.getProperty("file.encoding"));
    }
}
