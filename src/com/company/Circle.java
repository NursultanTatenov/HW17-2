package com.company;

public class Circle extends Shape{
    private double radius;
    private double circlePerimeter;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        circlePerimeter=2*radius*Math.PI;
        return circlePerimeter;
    }
}
