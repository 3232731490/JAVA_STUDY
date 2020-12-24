package com.nilu.ioProject.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class MyPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("D:"+ File.separator+"NILU.txt");
        PrintWriter printWriter=new PrintWriter(new FileOutputStream(file));
        printWriter.print("NILU");
        printWriter.print(" "+18);

        printWriter.println();

        printWriter.print("LIHUI");
        printWriter.print(" "+19);

        String str=new String("倪路");
        int age=18;
        printWriter.printf("\n姓名： %s 、 年龄： %d",str,age);
        printWriter.close();
    }
}
