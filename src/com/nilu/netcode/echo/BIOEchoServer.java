package com.nilu.netcode.echo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BIOEchoServer {
    private static class ClientThread implements Runnable{
        private Socket client=null;
        private Scanner scan=null;
        private PrintStream out=null;
        private boolean flag=true;
        public ClientThread(Socket socket) throws Exception
        {
            this.client=socket;
            this.scan=new Scanner(socket.getInputStream());
            this.scan.useDelimiter("\n");
            this.out=new PrintStream(socket.getOutputStream());
        }
        @Override
        public void run() {
            while(this.flag)
            {
                if(scan.hasNext())
                {
                    String val=scan.next().trim();
                    if("byebye".equalsIgnoreCase(val))
                    {
                        this.out.println("BYEBYE...");
                        flag=false;
                    }
                    else
                    {
                        this.out.println("【ECHO】"+val);
                    }
                }
            }
            try{
                this.out.close();
                this.scan.close();
                this.client.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket=new ServerSocket(9999);
        System.out.println("等待客户端连接.....");
        boolean flag=true;
        while(flag){
        Socket client=serverSocket.accept();
        new Thread(new ClientThread(client)).start();
        }
        serverSocket.close();
    }
}
