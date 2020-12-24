package com.nilu.extend.test01;

public class Student extends Person{
    private double math;
    private double english;

    public Student(){}
    public Student(double math, double english) {
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "math=" + math +
                ", english=" + english +'}'+super.toString()
                ;
    }

    public Student(String name, String addr, char sex, int age, double math, double english) {
        super(name, addr, sex, age);
        this.math = math;
        this.english = english;
    }
}
