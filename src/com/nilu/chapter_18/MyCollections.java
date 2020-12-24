package com.nilu.chapter_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"nilu","lihui","yangbaosheng");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"lihui"));
    }
}
