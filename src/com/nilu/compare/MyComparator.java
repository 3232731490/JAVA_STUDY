package com.nilu.compare;

import java.util.Arrays;
import java.util.Comparator;

class MenberComparator implements Comparator<Menber2>{
    @Override
    public int compare(Menber2 o1, Menber2 o2) {
        return o1.getM_Age()-o2.getM_Age();
    }
}
class Menber2 {
    private String m_Name;
    private int m_Age;

    public Menber2() {
    }

    public Menber2(String m_Name, int m_Age) {
        this.m_Name = m_Name;
        this.m_Age = m_Age;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    @Override
    public String toString() {
        return "Menber{" +
                "m_Name='" + m_Name + '\'' +
                ", m_Age=" + m_Age +
                '}';
    }

    public int getM_Age() {
        return m_Age;
    }

    public void setM_Age(int m_Age) {
        this.m_Age = m_Age;
    }


}
public class MyComparator {
    public static void main(String[] args) {
        Menber2 menber2[]=new Menber2[]{
                new Menber2("倪路",18),
                new Menber2("杨宝胜",20),
                new Menber2("李慧",19)
        };
        Arrays.sort(menber2,new MenberComparator());
        System.out.println(Arrays.toString(menber2));
    }
}
