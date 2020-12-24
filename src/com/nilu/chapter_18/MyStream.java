package com.nilu.chapter_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Order{
    private String name;
    private double price;
    private int amount;

    public Order() {
    }

    public Order(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class MyStream {
    public static void main(String[] args) {
        //Stream 可以与Lambda表达式一起进行数据统计操作  每个Stream对象只能使用一次
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"nilu","lihui","yangbaosheng","lala","lilu");
        Stream<String> stringStream=list.stream();

        //将每个字母变成大写字母 在统计存在”L“字符串的个数
        System.out.println("******************数据统计***********************");
        System.out.println(stringStream.filter((str)->str.toUpperCase().contains("L")).count());

        Stream<String> stringStream2=list.stream();
        //数据采集
        System.out.println("******************数据采集***********************");
        List<String> result=stringStream2.filter((ele)->ele.toUpperCase().contains("L")).skip(2).limit(2).collect(Collectors.toList());
        System.out.println(result);

        System.out.println("******************MapReduce数据分析***********************");

        List<Order> list1=new ArrayList<>();
        Collections.addAll(list1,new Order("nilu",9.9,10),new Order("lihui",10,11),new Order("nili",11,12));
        DoubleSummaryStatistics stat=list1.stream().filter((ele)->ele.getName().toUpperCase().contains("L")).mapToDouble((orderobject)->orderobject.getPrice()*orderobject.getAmount()).summaryStatistics();
        System.out.println("购买数量： "+stat.getCount());
        System.out.println("购买总价： "+stat.getSum());
        System.out.println("平均花费： "+stat.getAverage());
        System.out.println("最高花费： "+stat.getMax());
        System.out.println("最低花费： "+stat.getMin());

    }
}
