package com.nilu.reflect;

interface IMessage{
    public void send();
}
class CloudMessage implements IMessage {
    @Override
    public void send() {
        System.out.println("云消息");
    }
}
class NetMessage implements IMessage {
    @Override
    public void send() {
        System.out.println("网络消息");
    }
}
class Factory{
    private Factory(){}

    @SuppressWarnings("unchecked")
    public static <T> T getInstance(String className, Class<T> clazz )
    {
        T instance=null;
        try {
            instance=(T)Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
public class NewFactory {
    public static void main(String[] args) {
        IMessage msg= Factory.getInstance("com.nilu.reflect.CloudMessage",CloudMessage.class);
        msg.send();
        /**
         * 获取父接口信息
         */
        Class<?> clazz=CloudMessage.class;
        Class<?>[] clazzs=clazz.getInterfaces();
        for (Class<?> temp:clazzs
             ) {
            System.out.println(temp.getName());
        }

    }
}
