package com.nilu.adtractinterface.test01.test03;

public class Circle extends Shape{
    private double R;
    Circle(){}
    Circle(double r)
    {
        this.R=r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public double area() {
        return Math.PI*this.R*this.R;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.R;
    }
}
