package com.nilu.chapter_18;

import java.util.*;

class Member implements Comparable<Member>{
    private String name;
    private int age;

    public Member() {
    }

    public Member(String name, int age) {
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
    public int compareTo(Member o) {
        if(this.age<o.age)
        {
            return -1;
        }
        else if(this.age==o.age)
        {
            return this.name.compareTo(o.name);
        }
        else
        {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age &&
                Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
//Set 不能保存重复数据
public class MySet {
    public static void main(String[] args) {
        //保存重复数据会报出异常 IllegalArgumentException
//        Set<String> set= Set.of("nilu","nilu","lihui");
//        System.out.println(set);
       Set<String> set= Set.of("nilu","lihui");
       System.out.println(set);

       //HashSet  数据散列存放
        System.out.println("*****************HashSet*************************");
        Set<String> set1=new HashSet<>();
        set1.add("nilu");
        set1.add("nilu1");
        set1.add("nilu2");
        set1.add("nilu3");
        set1.add("nilu3");
        System.out.println(set1);

        //在HashSet中保存自定义类时要注意重复元素消除的问题 需要在自定义类中覆写hashcode和equals函数 不覆写则达不到消除重复元素的要求
        Set<Member> MHSet=new HashSet<>();
        MHSet.add(new Member("nilu",18));
        MHSet.add(new Member("nilu",18));
        MHSet.add(new Member("lihui",19));
        MHSet.add(new Member("yangbaosheng",20));
        System.out.println(MHSet);
        //LinkedHashSet 数据按照输入顺序存放
        System.out.println("****************LinkedHashSet********************");
        Set<String > set2=new LinkedHashSet<>();
        set2.add("nilu");
        set2.add("nilu1");
        set2.add("nilu2");
        set2.add("nilu3");
        set2.add("nilu3");
        System.out.println(set2);

        //TreeSet  数据按照有序存放  保存自定义类必须实现Comparable接口，覆写compareTo时需要进行类中所有属性的比较
        System.out.println("*******************TreeSet************************");
        Set<String> set3=new TreeSet<>();
        set3.add("nilu");
        set3.add("lihui");
        set3.add("wenzhongxu");
        set3.add("xiewujie");
        System.out.println(set3);

        Set<Member> Mset=new TreeSet<>();
        Mset.add(new Member("nilu",18));
        Mset.add(new Member("nilu",18));
        Mset.add(new Member("lihui",19));
        Mset.add(new Member("yangbaosheng",20));
        System.out.println(Mset);


    }
}
