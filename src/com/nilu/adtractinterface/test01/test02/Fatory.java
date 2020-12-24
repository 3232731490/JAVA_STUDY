package com.nilu.adtractinterface.test01.test02;

public class Fatory {
    public static Draw shapeJudge(String shape)
    {
        if(shape.equals("Circle"))
        {
            return new Circle();
        }
        else if (shape.equals("A"))
        {
            return new A();
        }
        else
        {
            return null;
        }
    }
}
