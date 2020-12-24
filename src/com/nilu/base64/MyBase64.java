package com.nilu.base64;

import java.util.Base64;

public class MyBase64 {
    public static void main(String[] args) {
        String S="nilu";
        String enS=new String(Base64.getEncoder().encode(S.getBytes()));
        System.out.println("加密后： "+enS);
        String deS=new String(Base64.getDecoder().decode(enS));
        System.out.println("解密后： "+deS);
    }
}
