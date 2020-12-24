package com.nilu.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Message {
    public static void main(String[] args) {
        ResourceBundle res1= ResourceBundle.getBundle("com.nilu.message.Message");
        String i=res1.getString("info");
        System.out.println(i);

        Locale L=new Locale("en","US");
        ResourceBundle res2= ResourceBundle.getBundle("com.nilu.message.Message",L);
        String i2=res2.getString("info");
        System.out.println(i2);

        String i3=res2.getString("info2");
        System.out.println(MessageFormat.format(i3,"七班","没有"));
    }
}
