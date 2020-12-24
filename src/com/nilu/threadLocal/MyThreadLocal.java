package com.nilu.threadLocal;

public class MyThreadLocal {
    public static void main(String[] args) {
        new Thread(()->{
           Message msg=new Message();
           msg.setInfo("线程消息A： Anilu");
           channel.setMessage(msg);
           channel.send();
        }).start();
        new Thread(()->{
            Message msg=new Message();
            msg.setInfo("线程消息B： Bnilu");
            channel.setMessage(msg);
            channel.send();
        }).start();
        new Thread(()->{
            Message msg=new Message();
            msg.setInfo("线程消息C： Cnilu");
            channel.setMessage(msg);
            channel.send();
        }).start();
    }
}
class channel{
    private static final ThreadLocal<Message> THREAD_LOCAL=new ThreadLocal<Message>();
    public static void setMessage(Message m)
    {
        THREAD_LOCAL.set(m);
    }
    public static void send()
    {
        System.out.println("【"+Thread.currentThread().getName()+" 】、消息发送" +THREAD_LOCAL.get().getInfo());
    }

}
class Message{
    private String info="nilu";

    public Message(String info) {
        this.info = info;
    }

    public Message() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
