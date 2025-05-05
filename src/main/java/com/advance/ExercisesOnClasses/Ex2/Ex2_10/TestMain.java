package com.advance.ExercisesOnClasses.Ex2.Ex2_10;

import com.advance.ExercisesOnClasses.Ex2.Ex2_6.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 4);
        MyRectangle r1 = new MyRectangle(p1, p2);
        System.out.println("Rectangle r1: " + r1);
        System.out.println("Width of r1: " + r1.getWidth());
        System.out.println("Height of r1: " + r1.getHeight());
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());

        MyRectangle r2 = new MyRectangle(0, 1, 3, 0);
        System.out.println("Rectangle r2: " + r2);
        System.out.println("Width of r2: " + r2.getWidth());
        System.out.println("Height of r2: " + r2.getHeight());
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
    }
}
