package com.nilu.compare;

import java.util.Arrays;

class Menber implements Comparable<Menber>{
    private String m_Name;
    private int m_Age;

    public Menber() {
    }

    public Menber(String m_Name, int m_Age) {
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

    @Override
    public int compareTo(Menber o) {
        if(this.m_Age>o.m_Age)
            return 1;
        else if(this.m_Age<o.m_Age)
            return -1;
        else
            return 0;
    }
}
public class MyComparable {
    public static void main(String[] args) {
        Menber menber[]=new Menber[]{
                new Menber("倪路",18),
                new Menber("杨宝胜",20),
                new Menber("李慧",19)
        };
        Arrays.sort(menber);
        System.out.println(Arrays.toString(menber));
    }

}
