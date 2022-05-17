package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle=new Circle(5);
        System.out.println("Perimeter of Circle: "+circle.getPerimeter());

        Rectangle rectangle=new Rectangle(3,5);
        System.out.println("Perimeter of Rectangle: "+(int)rectangle.getPerimeter());

        Square square=new Square(5);
        System.out.println("Perimeter of Square: "+(int)square.getPerimeter());

        Triangle triangle=new Triangle(3,4,5);
        System.out.println("Perimeter of triangle: "+(int)triangle.getPerimeter());

        Parallelogram parallelogram=new Parallelogram(4,5);
        System.out.println("Perimeter of Parallelogram: "+(int)parallelogram.getPerimeter());







    }
}
