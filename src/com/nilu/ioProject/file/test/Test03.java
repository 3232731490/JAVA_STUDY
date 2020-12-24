package com.nilu.ioProject.file.test;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
class Student implements Comparable<Student>{
private String name;
private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'+"\n";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return o.age-this.age;
    }

}
public class Test03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请按以下格式输入数据：");
        System.out.println("姓名：成绩|姓名：成绩|姓名：成绩");
        String str=sc.next();
        String results[]=str.split("\\|");
        Student[]students=new Student[results.length];
        for (int i = 0; i < results.length; i++) {
            String result[]=results[i].split("：");
           students[i]=new Student(result[0],Integer.parseInt(result[1]));
        }
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        File file=new File("D:"+ File.separator+"Student.txt");
        PrintWriter output=new PrintWriter(new FileOutputStream(file));
        for (int i = 0; i < students.length; i++) {
            output.println(students[i].getName()+"："+students[i].getAge());
        }
        output.close();
        System.out.println("保存成功");
        while(true)
        {
            System.out.println("您要继续添加学生信息吗？（1-继续 | 0-退出）");
            int choice=sc.nextInt();
            if(choice==0)
            {
                break;
            }
            else if(choice==1)
            {
                System.out.println("请按以下格式输入数据：");
                System.out.println("姓名：成绩|姓名：成绩|姓名：成绩");
                String str2=sc.next();
                String results2[]=str2.split("\\|");
                Student[]students2=new Student[results2.length];
                for (int i = 0; i < results.length; i++) {
                    String result2[]=results[i].split("：");
                    students2[i]=new Student(result2[0],Integer.parseInt(result2[1]));
                }
                Arrays.sort(students2);
                for (int i = 0; i < students2.length; i++) {
                    System.out.println(students2[i].toString());
                }
                PrintWriter output2=new PrintWriter(new FileOutputStream(file,true));
                for (int i = 0; i < students.length; i++) {
                    output2.println(students2[i].getName()+"："+students2[i].getAge());
                }
                output2.close();
                System.out.println("添加成功");
            }
            else
            {
                System.out.println("您的输入有误，请重新输入...");
                continue;
            }
        }
    }
}
