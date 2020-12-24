package com.nilu.chapter_18;

import java.util.*;
class Person2{
    private String name;
    private int age;

    public Person2() {
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class MyMap {
    public static void main(String[] args) {
        Map<Integer,String> map=Map.of(1,"nilu",2,"lihui");
        System.out.println(map);

        //HashMap  按照key顺序
        System.out.println("*******************HashMap************************");
        Map<Integer,String> map1=new HashMap<>();
        map1.put(2,"lihui");
        map1.put(1,"nilu");
        map1.put(3,"yangbaosheng");
        map1.put(4,"null");
        map1.put(null,"lala");
        System.out.println(map1);

        //LinkedHashMap  按照输入顺序
        System.out.println("*******************LinkedHashMap************************");

        Map<Integer,String> map2=new LinkedHashMap<>();
        map2.put(2,"lihui");
        map2.put(1,"nilu");
        map2.put(3,"yangbaosheng");
        map2.put(4,"null");
        map2.put(null,"lala");
        System.out.println(map2);

        //Hashtable  按照key倒叙
        System.out.println("*******************Hashtable************************");
        Map<Integer,String> map3=new Hashtable<>();
        map3.put(2,"lihui");
        map3.put(1,"nilu");
        map3.put(3,"yangbaosheng");
        System.out.println(map3);

        //TreeMap  会按照key的compareTo方法排序
        System.out.println("**********************TreeMap***************************");
        Map<String,Integer> map4=new TreeMap<String,Integer>();
        map4.put("one",1);
        map4.put("two",2);
        map4.put("three",3);
        System.out.println(map4);

        //Map.Entry  在Map集合中，所有保存的对象都属于二元偶对象，针对偶对象的数据操作标准就提供一个Map.Entry内部接口
        System.out.println("**********************Map.Entry***************************");
        Map.Entry<String,Integer> entry= Map.entry("one",1);
        System.out.println("key="+entry.getKey());
        System.out.println("value="+entry.getValue());

        //Iterator 输出Map集合
        System.out.println("**********************Iterator 输出Map集合***************************");
        Set<Map.Entry<Integer, String>> set=map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator=set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer, String> entry1=iterator.next();
            System.out.println("key="+entry1.getKey()+" value="+entry1.getValue());
        }
        System.out.println("*****************foreach输出******************************");
        //通过foreach输出
        for(Map.Entry<Integer,String> temp:set)
        {
            System.out.println("key="+temp.getKey()+" value="+temp.getValue());
        }

        //自定义key类型 必须在作为key类型的类中覆写hashcode和equals方法
        System.out.println("*****************自定义Key类型******************************");
        Map<Person2,Integer> map5=new HashMap<>();
        map5.put(new Person2("nilu",18),1);
        map5.put(new Person2("lihui",19),2);
        map5.put(new Person2("yangbaosheng",20),3);
        System.out.println(map5);
    }
}
