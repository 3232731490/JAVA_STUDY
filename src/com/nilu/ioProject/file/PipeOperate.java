package com.nilu.ioProject.file;

import java.io.*;

class Send implements Runnable{
    private PipedOutputStream Pout;

    public Send() {
        Pout = new PipedOutputStream();
    }

    @Override
    public void run() {
        try {
            this.Pout.write("NiLu".getBytes());
            Pout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PipedOutputStream getPout() {
        return Pout;
    }
}
class Receive implements Runnable{
    private PipedInputStream Pinput;

    public Receive() {
        Pinput = new PipedInputStream();
    }

    @Override
    public void run() {
        byte[] data=new byte[1024];
        int len=0;
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        try {
            //用内存操作流接收
//          while((len=this.Pinput.read(data))!=-1)
//          {
//              bos.write(data,0,len);
//          }
//            Pinput.close();
//            System.out.println(new String(bos.toByteArray()));
//            bos.close();
            len=this.Pinput.read(data);
            System.out.println(Thread.currentThread().getName()+" + "+new String(data,0,len));
            Pinput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PipedInputStream getPout() {
        return Pinput;
    }
}
public class PipeOperate {
    public static void main(String[] args) throws IOException {
        Send send=new Send();
        Receive receive=new Receive();
        send.getPout().connect(receive.getPout());
        new Thread(send).start();
        new Thread(receive).start();
    }
}
