package com.nilu.adtractinterface.test01.test03;

public class Oval extends Shape{
   private double a;
   private double b;
   Oval(){}
   Oval(double a,double b)
   {
       this.a=a;
       this.b=b;
   }
   public double getA()
   {
       return this.a;
   }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a)
   {
       this.a=a;
   }

    @Override
    public double perimeter() {
        return 2*Math.PI*b+4*(a-b);
    }

    @Override
    public double area() {
        return Math.PI*this.a*this.b;
    }
}
