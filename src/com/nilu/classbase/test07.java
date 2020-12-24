package com.nilu.classbase;

import java.util.Arrays;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score!=o.score)
        {
            return -(this.score-o.score);
        }
        else
        {
            return this.age-o.age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class test07 {
    public static void main(String[] args) {
        String str="倪路:18:99|绕婷鹏:17:90|李慧:19:98|杨宝胜:18:96|杨天锋:29:67";
        String result[]=str.split("\\|");
        Student[] stu=new Student[result.length];
        for (int i = 0; i < result.length; i++) {
            String consenquece[] = result[i].split(":");
            stu[i]=new Student(consenquece[0],Integer.parseInt(consenquece[1]),Integer.parseInt(consenquece[2]));
        }
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));
    }
}
