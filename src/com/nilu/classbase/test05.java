package com.nilu.classbase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test05 {
    public static void main(String[] args) {
        String str="<font face=\"Arial,Serif\"size=\"+2\"color=\"red\">";
        String regex="\\w+=\"[0-9A-Za-z,\\+]+\"";
        Pattern P=Pattern.compile(regex);
        Matcher mather=P.matcher(str);
        while(mather.find())
        {
            String S=mather.group(0);
            String temp[]=S.split("=");
            System.out.println(temp[0]+"  "+temp[1].replaceAll("\"",""));
        }
    }
}

