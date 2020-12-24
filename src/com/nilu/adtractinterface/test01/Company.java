package com.nilu.adtractinterface.test01;

public class Company implements ClassName{
   private String className;

    public Company(String className) {
        this.className = className;
    }

    public Company() {
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getClassName() {
        return this.className;
    }
}
