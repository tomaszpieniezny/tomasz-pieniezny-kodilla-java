package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double h;
    private double a;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }
    @Override
    public String getShapeName(){
        return "Triangle";
    }

    @Override
    public double getField() {
        return a*h/2;
    }
}
