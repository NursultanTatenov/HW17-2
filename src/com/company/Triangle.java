package com.company;

public class Triangle extends Shape {
    private int width;
    private int length;
    private int height;
    private int trianglePerimeter;

    public Triangle(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        trianglePerimeter=width+length+height;
        return trianglePerimeter;
    }
}
