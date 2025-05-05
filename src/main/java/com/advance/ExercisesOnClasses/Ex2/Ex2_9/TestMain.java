package com.advance.ExercisesOnClasses.Ex2.Ex2_9;

import com.advance.ExercisesOnClasses.Ex2.Ex2_6.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("Tam giác t1: " + t1);
        System.out.println("Chu vi t1: " + t1.getPerimeter());
        System.out.println("Loại t1: " + t1.getType());

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 1);
        MyPoint p3 = new MyPoint(2, 3);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println("Tam giác t2: " + t2);
        System.out.println("Chu vi t2: " + t2.getPerimeter());
        System.out.println("Loại t2: " + t2.getType());

        MyTriangle t3 = new MyTriangle(0, 0, 2, 0, 1, (int) Math.sqrt(3)); // Tam giác đều
        System.out.println("Tam giác t3: " + t3);
        System.out.println("Loại t3: " + t3.getType());

        MyTriangle t4 = new MyTriangle(0, 0, 2, 0, 0, 2); // Tam giác vuông cân
        System.out.println("Tam giác t4: " + t4);
        System.out.println("Loại t4: " + t4.getType());

    }
}
