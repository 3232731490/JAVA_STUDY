package com.nilu.extend.test02;

public class Emp {
    private String name;
    private int age;
    private char sex;

    public Emp(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Emp() {
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
