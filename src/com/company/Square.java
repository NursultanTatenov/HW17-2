package com.company;

public class Square extends Shape{
    int width;
    int squarePerimeter;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        squarePerimeter=4*width;
        return squarePerimeter;
    }
}
