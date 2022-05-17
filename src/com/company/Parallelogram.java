package com.company;

public class Parallelogram extends Shape {
    private int width;
    private int length;
    private int parallelogramPerimeter;

    public Parallelogram(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        parallelogramPerimeter = 2 * (width + length);
        return parallelogramPerimeter;
    }
}
