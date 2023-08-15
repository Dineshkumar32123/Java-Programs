package com.assignment;

public interface I1 {
    public abstract int areaOfSquare(int a);
}
 interface I2 extends I1 {
    public abstract void areaOfRectangle(int a,int b);
}
 interface I3 extends I2 {
    public abstract void areaOfTriangle(double a,double b);
}
