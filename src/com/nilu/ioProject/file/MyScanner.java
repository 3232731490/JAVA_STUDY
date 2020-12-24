package com.nilu.ioProject.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            System.out.println(sc.nextInt());
        }
        else
        {
            System.out.println("输入有误");
        }
        System.out.println("输入生日");
        if(sc.hasNext("\\d{4}-\\d{2}-\\d{2}"))
        {
            String date=sc.next("\\d{4}-\\d{2}-\\d{2}");
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(date));
        }
        else
        {
            System.out.println("输入有误");
        }
        Scanner scFile=new Scanner(new File("D:"+ File.separator+"NILU.txt"));
        scFile.useDelimiter("\n");
        while(scFile.hasNext())
        {
            System.out.println(scFile.next());
        }
        scFile.close();
    }
}
