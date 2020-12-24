package com.nilu.ioProject.file;

import java.io.*;

class Person implements Serializable{  //必须写这个接口才可以序列化
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class MySerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("D:"+ File.separator+"LIHUI.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(file));
        Person person1=new Person("lihui",19);
        Person person2=new Person("nilu",18);
        outputStream.writeObject(person1);
        outputStream.writeObject(person2);
        outputStream.close();
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        Object obj=objectInputStream.readObject();
        Object obj2=objectInputStream.readObject();
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        objectInputStream.close();
    }
}
