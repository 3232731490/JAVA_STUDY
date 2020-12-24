package com.nilu.netcode.echo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务器端口
public class EchoServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket=new ServerSocket(9999); //设置服务监听端口
        System.out.println("等待客户连接........");
        //要先接受客户端发来的信息，才可以将信息处理后发回客户端
        Socket client=serverSocket.accept();
        Scanner scan=new Scanner(client.getInputStream());
        scan.useDelimiter("\n");  //设置分隔符
        PrintStream printStream=new PrintStream(client.getOutputStream());
        boolean flag=true;
        while(flag)
        {
            if(scan.hasNext())
            {
                String val=scan.next().trim();
                if("byebye".equalsIgnoreCase(val))
                {
                    printStream.println("BYEBYE......");
                    flag=false;
                }
                else
                {
                    printStream.println("【Echo】"+val);
                }
            }
        }
        scan.close();
        printStream.close();
        client.close();
        serverSocket.close();
    }
}
