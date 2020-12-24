package com.nilu.ioProject.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRandomAccessFile {
    public static void main(String[] args) throws IOException {
        //写入数据
        File file=new File("D:"+ File.separator+"NILU.txt");
        RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
        String []str=new String[]{"NILU    ","LIHUI   ","BAOSHENG"};
        int [] num=new int[]{18,19,20};
        for (int i = 0; i < num.length; i++) {
            randomAccessFile.write(str[i].getBytes());
            randomAccessFile.writeInt(num[i]);
        }
        randomAccessFile.close();
        //读取数据
        RandomAccessFile randomAccessFile2=new RandomAccessFile(file,"rw");
        //读取第三人数据
        {randomAccessFile2.skipBytes(24);
        byte[] data=new byte[8];
       int len= randomAccessFile2.read(data);
        System.out.println("姓名： "+new String(data,0,len).trim()+" 年龄："+ randomAccessFile2.readInt());
        }

        //读取第二人
        {
            randomAccessFile2.seek(12);
            byte[] data=new byte[8];
            int len= randomAccessFile2.read(data);
            System.out.println("姓名： "+new String(data,0,len).trim()+" 年龄："+ randomAccessFile2.readInt());
        }
        //读取第一人
        {
            randomAccessFile2.seek(0);
            byte[] data=new byte[8];
            int len= randomAccessFile2.read(data);
            System.out.println("姓名： "+new String(data,0,len).trim()+" 年龄："+ randomAccessFile2.readInt());
        }
        randomAccessFile2.close();
    }
}
