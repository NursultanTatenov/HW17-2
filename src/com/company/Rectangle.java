package com.company;

public class Rectangle extends Shape{
    private int width;
    private int length;
    private int rectanglePerimeter;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        rectanglePerimeter=2*(width+length);
        return rectanglePerimeter;
    }
}
