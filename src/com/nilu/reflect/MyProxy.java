package com.nilu.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IMessage2{
  void send();
}
class Message implements IMessage2{
    public void send(){
        System.out.println("【消息发送】:可恶");
    }
}
class MessageProxy implements InvocationHandler {
    private Object object;
    private boolean connect(){
        System.out.println("【代理消息】消息通道连接");
        return true;
    }
    private void close(){
        System.out.println("【代理消息】消息通道关闭");
    }
    /**
     * 进行真实业务对象与代理业务对象之间的绑定
     * @param object 真实业务对象
     * @return Proxy生成的代理业务对象
     */
    public Object bind(Object object)
    {
        this.object=object;  //保存真实业务对象
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    /**
     * 代理操作方法
     * @param proxy 代理对象
     * @param method 要执行的目标类方法
     * @param args 执行方法所需的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returndata=null;
        if(this.connect()){
        returndata=method.invoke(this.object,args);
        this.close();
        }
        return returndata;
    }
}
public class MyProxy {
    public static void main(String[] args) {
        IMessage2 iMessage2=(IMessage2)new MessageProxy().bind(new Message());
        iMessage2.send();
    }
}
