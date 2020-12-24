package com.nilu.netcode.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket server=new DatagramSocket(9990);  //9990端口监听
        String str="lihui";
        DatagramPacket packet=new DatagramPacket(str.getBytes(),0,str.length(), InetAddress.getByName("localhost"),9999);
        server.send(packet);
        server.close();
    }
}
