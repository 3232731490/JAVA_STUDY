package com.nilu.adtractinterface.test01.test03;
import java.lang.Math;
public class Triangle extends Shape{
    private double x;
    private double y;
    private double z;
    Triangle(){};

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double perimeter() {
        return this.x+this.y+this.z;
    }

    @Override
    public double area() {
        double sum=this.x+this.z+this.y;
        return Math.sqrt(sum*(sum-this.x)*(sum-this.y)*(sum-this.z));
    }
}
