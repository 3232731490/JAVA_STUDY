package com.nilu.chapter_18;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stirngStack=new Stack<String>();
        stirngStack.push("nilu");
        stirngStack.push("lihui");
        stirngStack.push("yangbaohseng");
        stirngStack.push("lalal");
        System.out.println(stirngStack);
        System.out.println(stirngStack.pop());
        System.out.println(stirngStack.pop());
        System.out.println(stirngStack.pop());
        System.out.println(stirngStack.pop());
    }
}
