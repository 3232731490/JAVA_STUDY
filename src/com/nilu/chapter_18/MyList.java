package com.nilu.chapter_18;

import java.util.*;

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    //覆写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//List可以保存重复数据
public class MyList {
    public static void main(String[] args) {
        List<String> list=List.of("nilu","lihui","yangbaosheng");
        Object results[]=list.toArray();
        for(Object temp:results)
        {
            System.out.println(temp);
        }

        System.out.println("**********************ArrayList***************************");
        //ArrayList 非线程安全
        List<String> list1=new ArrayList<>();
        list1.add("nilu");
        list1.add("nilu2");
        list1.add("nilu3");
        list1.add("nilu4");
        System.out.println(list1.contains("nilu"));
        list1.remove("nilu");
        System.out.println(list1.contains("nilu"));
        System.out.println(list1);
        //另外的输出方法
        list1.forEach((str)->{
            System.out.print(str+"、");
        });
        System.out.println();
        //如果要保存自定义类对象，必须覆写equals方法
        List<Person> Plist=new ArrayList<>();
        Plist.add(new Person("nilu",18));
        Plist.add(new Person("lihui",19));
        Plist.add(new Person("杨宝胜",20));
        Plist.add(new Person("扬天风",16));
        System.out.println(Plist);

        //LinkedList  与ArrayList 类似
        System.out.println("*****************LinkedList**************************");
        List<String> list2=new LinkedList<>();
        list2.add("nilu");
        list2.add("lihui");
        System.out.println(list2);

        //Vector 线程安全
        System.out.println("**************Vector*********************");
        List<String> list3=new Vector<>();
        list3.add("nilu");
        list3.add("lihui");
        System.out.println(list3);
    }
}
