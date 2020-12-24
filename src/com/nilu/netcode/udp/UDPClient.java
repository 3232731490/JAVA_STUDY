package com.nilu.netcode.udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket client=new DatagramSocket(9999);
        byte data[]=new byte[1024];
        DatagramPacket packet=new DatagramPacket(data,data.length);
        System.out.println("客户端等待接收发送的消息");
        client.receive(packet);
        System.out.println("客户端接收到消息： "+new String(data,0,packet.getLength()));
        client.close();
    }
}
