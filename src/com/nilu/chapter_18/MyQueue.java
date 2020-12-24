package com.nilu.chapter_18;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        //PriorityQueue 为优先级队列，会自动对数据排序，排列需要comparable支持
        Queue<String> queue=new PriorityQueue<String>();
        queue.add("nilu");
        queue.add("lihui");
        queue.add("yangboahsng");
        queue.add("llala");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //Deque 双向队列
        System.out.println("******************Deque**********************");
        Deque<String> deque=new LinkedList<String>();
        deque.offer("nilu");
        deque.offerFirst("lilhui");
        deque.offerLast("yang");
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
