package com.nilu.chapter_18;

import java.io.*;
import java.util.Properties;

public class MyProperties {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.setProperty("1","nilu");
        properties.setProperty("2","lihui");
        properties.setProperty("3","yangbaosheng");
        System.out.println(properties.getProperty("1"));
        System.out.println(properties.getProperty("2"));
        System.out.println(properties.getProperty("3"));

        //将properties保存到文件中
        properties.store(new FileOutputStream(new File("D:"+ File.separator+"info.properties")),"测试文件");

        //从文件中读取properties
        Properties prop=new Properties();
        prop.load(new FileInputStream(new File("D:"+ File.separator+"info.properties")));
        System.out.println(prop);
    }
}
