package com.nilu.chapter_18;

import java.util.*;
class Member2 implements Iterable<String>{
    private String[] content=new String[]{"nilu","lihui","yangbaosheng"};
    private int foot=0;
    @Override
    public Iterator<String> iterator() {
        return new MemberIterator();
    }
    private class MemberIterator implements Iterator<String>{

        @Override
        public boolean hasNext() {
            return Member2.this.foot<Member2.this.content.length;
        }

        @Override
        public String next() {
            return Member2.this.content[Member2.this.foot++];
        }
    }
}
public class MyIterator {
    public static void main(String[] args) {
        Set<String> set= Set.of("nilu","lihui","yangbaosheng","chentianxu");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+"、");
        }

        //ListIterator 双向迭代输出
        System.out.println("*********************ListIterator******************");
        List<String> list=List.of("nilu","lihui","yangbaosheng");
        ListIterator<String> listIterator=list.listIterator();
        System.out.println("从前向后输入");
        while(listIterator.hasNext())
        {
            System.out.print(listIterator.next()+"、");
        }
        System.out.println("从后向前输出");
        while(listIterator.hasPrevious())
        {
            System.out.print(listIterator.previous()+"、");
        }
        System.out.println();
        //Eunmeration 枚举输出
        System.out.println("**********************Eunmeration**************************");
        Vector<String> vector=new Vector<>();
        vector.add("nilu");
        vector.add("lihui");
        vector.add("yangbaosheng");
        Enumeration<String> enumeration=vector.elements();
        while(enumeration.hasMoreElements())
        {
            System.out.print(enumeration.nextElement()+"、");
        }
        System.out.println();

        //foreach 输出 如果要实现自定义类使用foreach输出则必须继承Iterable接口
        System.out.println("***************foreach*********************");
        for(String str:set)
        {
            System.out.print(str+"、");
        }
        System.out.println();
        //照着书上打还是不行
//      Member member2=new Member();
//      for(String str:member2) {
//          System.out.println(str);
//      }


    }
}
