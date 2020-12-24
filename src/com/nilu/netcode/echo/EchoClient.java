package com.nilu.netcode.echo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class EchoClient {
    private static final BufferedReader KEYBOARD_INPUT =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        Socket client=new Socket("localhost",9999);  //定义服务器端连接信息
        Scanner scan=new Scanner(client.getInputStream());
        scan.useDelimiter("\n");  //设置分隔符
        PrintStream out=new PrintStream(client.getOutputStream());
        boolean flag=true;
        while(flag)
        {
            String val=getString("请输入要发送的内容： ").trim();
            out.println(val);
            if(scan.hasNext())
            {
                System.out.println(scan.next());
            }
            if("byebye".equalsIgnoreCase(val))
            {
                flag=false;
            }
        }
        out.close();
        scan.close();
        client.close();
    }
    public static String getString(String prompt) throws Exception{
        System.out.println(prompt);
        String str=KEYBOARD_INPUT.readLine();
        return str;
    }
}
