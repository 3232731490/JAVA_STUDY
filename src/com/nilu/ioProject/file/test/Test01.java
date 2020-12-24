package com.nilu.ioProject.file.test;

import java.io.*;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您要保存的文件内容：");
        String content=scanner.next();
        System.out.println("请输入您要保存的文件名称：");
        String path=scanner.next();
        File file=new File("D:"+ File.separator+path);
        OutputStream output=new FileOutputStream(file);
        output.write(content.getBytes());
        System.out.println("保存成功");
    }
}
